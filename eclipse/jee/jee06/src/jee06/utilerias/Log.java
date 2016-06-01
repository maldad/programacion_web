package jee06.utilerias;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

public final class Log {
  
  public static final void println() {
    Date fecha = new Date();
    System.out.println("[ " + fecha + " ] ");
  }
  
  public static final void println(String mensaje) {
    Date fecha = new Date();
    System.out.println("[ " + fecha + " ] " + mensaje);
  }
  
  public static final void println(String sujeto, String mensaje) {
    Date fecha = new Date();
    System.out.println("[ " + fecha + " ] " + sujeto + " : " + mensaje);
  }
  
  public static final void solicitudHttpGET(HttpServletRequest request) {
    Date fecha = new Date();
    String mensaje = request.getMethod() + " : " + request.getRequestURI();
    if (request.getQueryString() != null) {
      mensaje += "?" + request.getQueryString();
    }
    System.out.println("[ " + fecha + " ] " + mensaje);
  }
  
  public static final void solicitudHttpPOST(HttpServletRequest request) {
    Date fecha = new Date();
    String mensaje = request.getMethod() + " : " + request.getRequestURI();
    if (request.getQueryString() != null) {
      mensaje += "?" + request.getQueryString();
    }
    System.out.println("[ " + fecha + " ] " + mensaje);
    
    Map<String, String[]> parametros = request.getParameterMap();
    if (!parametros.isEmpty()) {
      Set<String> llaves =  parametros.keySet();
      Iterator<String> iterador = llaves.iterator();
      while (iterador.hasNext()) {
        String llave = iterador.next();
        String[] valores = parametros.get(llave);
        for (int i = 0; i < valores.length; i++) {
          System.out.println("[ " + fecha + " ] \t\tllave: \"" + llave + "\", valor: \"" + valores[i] + "\"");
        }
      }
    }
  }
  
  public static final void error(String sujeto, String mensaje) {
    Date fecha = new Date();
    System.err.println("[ " + fecha + " ] " + sujeto + " : " + mensaje);
  }
  
  public static final void excepcion(String sujeto, Exception e) {
    Date fecha = new Date();
    System.err.println("[ " + fecha + " ] " + sujeto + " : " + e.getMessage());
  }
}
