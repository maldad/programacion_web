package jee05.utilidades;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class Despachador {
  
  public static final void deJSP(
      HttpServletRequest request,
      HttpServletResponse response,
      String ubicacionDelJSP) {
    ServletContext contextoDelServlet = request.getServletContext();
    
    String ubicacionInternaAlContextoDelJSP = "/WEB-INF/jee05/jsps" + ubicacionDelJSP;
    String ubicacionEnElDiscoDuroDelJSP = contextoDelServlet.getRealPath(ubicacionInternaAlContextoDelJSP);
    
    if (ubicacionEnElDiscoDuroDelJSP == null) {
      ubicacionEnElDiscoDuroDelJSP = "";
    }
    
    File jspEnDiscoDuro = new File(ubicacionEnElDiscoDuroDelJSP);
    
    if (!jspEnDiscoDuro.exists()) {
      Log.println("Despachador.deJSP()", "\tError, " + ubicacionInternaAlContextoDelJSP + " no existe en el contexto.");
      Log.println("Despachador.deJSP()", "\tGenerando una respuesta al cliente con código de estado HTTP 500");
      response.setStatus(500);
      ubicacionInternaAlContextoDelJSP = "/WEB-INF/jee05/jsps/500.jsp";
    }
    
    RequestDispatcher despachador = contextoDelServlet.getRequestDispatcher(ubicacionInternaAlContextoDelJSP);
    try {
      despachador.forward(request,response); 
    } catch (ServletException e) {
      Log.println("Despachador.deJSP()", "\tError, " + e.getMessage());
      Log.println("Despachador.deJSP()", "\tError, " + e.getCause());
    } catch (IOException e) {
      Log.println("Despachador.deJSP()", "\tError, " + e.getMessage());
      Log.println("Despachador.deJSP()", "\tError, " + e.getCause());
    }
    
  }
  
  public static final void deServlet(
      HttpServletRequest request,
      HttpServletResponse response,
      String ubicacionDelServlet){
    
    ServletContext contextoDelServlet = request.getServletContext();
    RequestDispatcher despachador = contextoDelServlet.getRequestDispatcher(ubicacionDelServlet);
    try {
      despachador.forward(request,response); 
    } catch (ServletException e) {
      Log.println("Despachador.deServlet()", "\tError, " + e.getMessage());
      Log.println("Despachador.deServlet()", "\tError, " + e.getCause());
    } catch (IOException e) {
      Log.println("Despachador.deServlet()", "\tError, " + e.getMessage());
      Log.println("Despachador.deServlet()", "\tError, " + e.getCause());
    }
    
  }
}
