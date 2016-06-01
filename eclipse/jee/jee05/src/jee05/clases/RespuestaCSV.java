package jee05.clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jee05.fuentesdedatos.PostgreSQL;
import jee05.tablasenbasedadatos.TablaPrueba;
import jee05.utilidades.Conversion;
import jee05.utilidades.Despachador;
import jee05.utilidades.Log;

public final class RespuestaCSV {
  public static final void generar(
      HttpServletRequest request,
      HttpServletResponse response) {
    Log.println("RespuestaCSV.generar()", "Atendiendo solicitud de impresión...");

    String consultaDeSQL = "select id, a, b, c, d, e, f from tablaprueba";
    ResultSet conjuntoDeResultados = null;
    Statement sentenciaDeSQL = null;
    
    Connection conexionAPostgreSQL = PostgreSQL.obtenerConexion();
    
    if (conexionAPostgreSQL == null) {
      response.setStatus(500);
      Despachador.deJSP(request, response, "/500.jsp");
    } else {
      sentenciaDeSQL = PostgreSQL.crearSentenciaDeSQL(conexionAPostgreSQL);
      if (sentenciaDeSQL == null) {
        response.setStatus(500);
        Despachador.deJSP(request, response, "/500.jsp");
      } else {
        conjuntoDeResultados = PostgreSQL.ejecutarConsultaDeSQL(sentenciaDeSQL, consultaDeSQL);
        if (conjuntoDeResultados == null) {
          response.setStatus(500);
          Despachador.deJSP(request, response, "/500.jsp");
        } else {
          TablaPrueba tablaPrueba = new TablaPrueba();
          Conversion.deResultSetATablaPrueba(conjuntoDeResultados, tablaPrueba);
          if (tablaPrueba.esConvertidaConExito()) {
            request.setAttribute("tablaPrueba", tablaPrueba);
            Despachador.deJSP(request, response, "/clases/RespuestaCSV/generar.jsp");
          } else {
            response.setStatus(500);
            Despachador.deJSP(request, response, "/500.jsp");
          }
        }
      }
    }
    
    PostgreSQL.cerrarConjuntoDeResultados(conjuntoDeResultados);
    PostgreSQL.cerrarSentenciaDeSQL(sentenciaDeSQL);
    PostgreSQL.cerrarConexion(conexionAPostgreSQL);
    
    Log.println("RespuestaCSV.generar()", "Solicitud de impresión en atendida.");
  }
}
