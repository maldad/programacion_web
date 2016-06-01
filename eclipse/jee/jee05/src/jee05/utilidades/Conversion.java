package jee05.utilidades;

import java.sql.ResultSet;
import java.sql.SQLException;

import jee05.tablasenbasedadatos.TablaPrueba;
import jee05.tablasenbasedadatos.TuplaTablaPrueba;

public final class Conversion {
  public static final void deResultSetATablaPrueba(ResultSet conjuntoDeResultados, TablaPrueba tablaPrueba) {
    Log.println("Conversion.deResultSetATablaPrueba()", "Realizando la conversión de ResultSet a TablaPrueba...");
    try {
      while(conjuntoDeResultados.next()) {
        
        TuplaTablaPrueba tupla = new TuplaTablaPrueba();

        /* En la tabla (PostgreSQL) es de tipo integer */
        tupla.setId(conjuntoDeResultados.getInt("id"));
        
        /* En la tabla (PostgreSQL) es de tipo varchar(255) */
        tupla.setA(conjuntoDeResultados.getString("a"));
        
        /* En la tabla (PostgreSQL) es de tipo varchar(255) */
        tupla.setB(conjuntoDeResultados.getString("b"));
        
        /* En la tabla (PostgreSQL) es de tipo varchar(255) */
        tupla.setC(conjuntoDeResultados.getString("c"));

        /* En la tabla (PostgreSQL) es de tipo integer */
        tupla.setD(conjuntoDeResultados.getInt("d"));
        
        /* En la tabla (PostgreSQL) es de tipo boolean */
        tupla.setE(conjuntoDeResultados.getBoolean("e"));
        
        /* En la tabla (PostgreSQL) es de tipo varchar(1) */
        tupla.setF(conjuntoDeResultados.getString("f").charAt(0));
        
        tablaPrueba.guardarTupla(tupla);
      }
      tablaPrueba.setConvertidaConExito(true);
      Log.println("Conversion.deResultSetATablaPrueba()", "\tExito la conversión de ResultSet a TablaPrueba.");
    } catch (SQLException e) {
      Log.println("Conversion.deResultSetATablaPrueba()", "\tError en la conversión de ResultSet a TablaPrueba.");
      Log.println("Conversion.deResultSetATablaPrueba()", "\tError, " + e.getMessage());
      Log.println("Conversion.deResultSetATablaPrueba()", "\tError, " + e.getCause());
    }
  }
}