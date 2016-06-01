package jee05.fuentesdedatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import jee05.utilidades.Log;

public final class PostgreSQL {
  public static final Connection obtenerConexion() {
    Log.println("PostgreSQL.obtenerConexion()", "Obteniendo conexión...");
    Connection conexionAPostgreSql = null;
    try {
      Context contexto = new InitialContext();
      DataSource fuenteDeDatos = (DataSource)contexto.lookup("java:comp/env/jdbc/PostgreSQL");
      conexionAPostgreSql = fuenteDeDatos.getConnection();
      Log.println("PostgreSQL.obtenerConexion()","\tExito, conexión obtenida.");
    } catch (NamingException e) {
      Log.println("PostgreSQL.obtenerConexion()","\tError, No se ha encontrado el recurso dentro del contexto.");
      Log.println("PostgreSQL.obtenerConexion()","\t" + e.getMessage());
      Log.println("PostgreSQL.obtenerConexion()","\t" + e.getCause());
      Log.println("PostgreSQL.obtenerConexion()","\t" + e.getExplanation());
    } catch (SQLException e) {
      Log.println("PostgreSQL.obtenerConexion()","\tError, No se ha logrado establecer una conexión a PostgreSQL.");
      Log.println("PostgreSQL.obtenerConexion()","\t" + e.getMessage());
      Log.println("PostgreSQL.obtenerConexion()","\t" + e.getCause());
      Log.println("PostgreSQL.obtenerConexion()","\t" + e.getErrorCode());
      Log.println("PostgreSQL.obtenerConexion()","\t" + e.getSQLState());
    }
    return conexionAPostgreSql;
  }

  public static final Statement crearSentenciaDeSQL(Connection conexion) {
    Log.println("PostgreSQL.crearSentenciaDeSQL()", "Creando sentencia de SQL...");
    Statement sentenciaDeSQL = null;
    try {
      sentenciaDeSQL = conexion.createStatement();
      Log.println("PostgreSQL.crearSentenciaDeSQL()", "\tExito, sentencia de SQL creada.");
    } catch (SQLException e) {
      Log.println("PostgreSQL.crearSentenciaDeSQL()","\tError, No se ha logrado crear una sentencia de SQL.");
      Log.println("PostgreSQL.crearSentenciaDeSQL()","\t" + e.getMessage());
      Log.println("PostgreSQL.crearSentenciaDeSQL()","\t" + e.getCause());
      Log.println("PostgreSQL.crearSentenciaDeSQL()","\t" + e.getErrorCode());
      Log.println("PostgreSQL.crearSentenciaDeSQL()","\t" + e.getSQLState());
    }
    return sentenciaDeSQL;
  }
  
  public static final ResultSet ejecutarConsultaDeSQL(Statement sentencia, String consultaDeSQL) {
    Log.println("PostgreSQL.ejecutarConsultaDeSQL()", "Ejecutando consulta de SQL...");
    Log.println("PostgreSQL.ejecutarConsultaDeSQL()", "\t" + consultaDeSQL);
    ResultSet conjuntoDeResultados = null;
    try {
      conjuntoDeResultados = sentencia.executeQuery(consultaDeSQL);
      Log.println("PostgreSQL.ejecutarConsultaDeSQL()", "\tExito, consulta de SQL ejecutada.");
    } catch (SQLException e) {
      Log.println("PostgreSQL.ejecutarConsultaDeSQL()","\tError, No se ha logrado obtener un conjunto de resultados.");
      Log.println("PostgreSQL.ejecutarConsultaDeSQL()","\t" + e.getMessage());
      Log.println("PostgreSQL.ejecutarConsultaDeSQL()","\t" + e.getCause());
      Log.println("PostgreSQL.ejecutarConsultaDeSQL()","\t" + e.getErrorCode());
      Log.println("PostgreSQL.ejecutarConsultaDeSQL()","\t" + e.getSQLState());
    }
    return conjuntoDeResultados;
  }

  public static final boolean cerrarConexion(Connection conexion) {
    Log.println("PostgreSQL.cerrarConexion()","Cerrando conexión...");
    try {
      conexion.close();
      Log.println("PostgreSQL.cerrarConexion()","\tExito, conexión cerrada...");
      return true;
    } catch (SQLException e) {
      Log.println("PostgreSQL.cerrarConexion()","\tError, No se ha logrado cerrar la conexión a PostgreSQL.");
      Log.println("PostgreSQL.cerrarConexion()","\t" + e.getMessage());
      Log.println("PostgreSQL.cerrarConexion()","\t" + e.getCause());
      Log.println("PostgreSQL.cerrarConexion()","\t" + e.getErrorCode());
      Log.println("PostgreSQL.cerrarConexion()","\t" + e.getSQLState());
    }
    return false;
  }
  
  public static final boolean cerrarSentenciaDeSQL(Statement sentencia) {
    Log.println("PostgreSQL.cerrarSentenciaDeSQL()","Cerrando sentencia de SQL...");
    try {
      sentencia.close();
      Log.println("PostgreSQL.cerrarSentenciaDeSQL()","\tExito, sentencia de SQL cerrada...");
      return true;
    } catch (SQLException e) {
      Log.println("PostgreSQL.cerrarSentenciaDeSQL()","\tError, No se ha logrado cerrar la sentencia de SQL.");
      Log.println("PostgreSQL.cerrarSentenciaDeSQL()","\t" + e.getMessage());
      Log.println("PostgreSQL.cerrarSentenciaDeSQL()","\t" + e.getCause());
      Log.println("PostgreSQL.cerrarSentenciaDeSQL()","\t" + e.getErrorCode());
      Log.println("PostgreSQL.cerrarSentenciaDeSQL()","\t" + e.getSQLState());
    }
    return false;
  }
  
  public static final boolean cerrarConjuntoDeResultados(ResultSet conjuntoDeResultados) {
    Log.println("PostgreSQL.cerrarConjuntoDeResultados()","Cerrando conjunto de resultados...");
    try {
      conjuntoDeResultados.close();
      Log.println("PostgreSQL.cerrarConjuntoDeResultados()","\tExito, conjunto de resultados cerrado.");
      return true;
    } catch (SQLException e) {
      Log.println("PostgreSQL.cerrarConjuntoDeResultados()","\tError, No se ha logrado cerrar el conjunto de resultados.");
      Log.println("PostgreSQL.cerrarConjuntoDeResultados()","\t" + e.getMessage());
      Log.println("PostgreSQL.cerrarConjuntoDeResultados()","\t" + e.getCause());
      Log.println("PostgreSQL.cerrarConjuntoDeResultados()","\t" + e.getErrorCode());
      Log.println("PostgreSQL.cerrarConjuntoDeResultados()","\t" + e.getSQLState());
    }
    return false;
  }
}
