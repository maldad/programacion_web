package jee05.utilidades;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public final class Log {
  
  public static final void println(
      String mensaje) {
    Date fecha = new Date();
    System.out.println("[ " + fecha + " ] " + mensaje);
  }
  
  public static final void println(
      String sujeto,
      String mensaje) {
    Date fecha = new Date();
    System.out.println("[ " + fecha + " ] " + sujeto + " : " + mensaje);
  }
  
  public static final void solicitudHttp(
      HttpServletRequest request) {
    Date fecha = new Date();
    String mensaje = request.getMethod() + " : " + request.getRequestURI();
    if (request.getQueryString() != null) {
      mensaje += "?" + request.getQueryString();
    }
    System.out.println("[ " + fecha + " ] " + mensaje);
  }
  
}
