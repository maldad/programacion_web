package jee06.utilerias;

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
    
    String ubicacionInternaAlContextoDelJSP = "/WEB-INF/jsps" + ubicacionDelJSP;
    String ubicacionEnElDiscoDuroDelJSP = contextoDelServlet.getRealPath(ubicacionInternaAlContextoDelJSP);
    
    if (ubicacionEnElDiscoDuroDelJSP == null) {
      ubicacionEnElDiscoDuroDelJSP = "";
    }
    
    File jspEnDiscoDuro = new File(ubicacionEnElDiscoDuroDelJSP);
    
    if (!jspEnDiscoDuro.exists()) {
      Log.error("Despachador.deJSP()", "Error, \"" + ubicacionInternaAlContextoDelJSP + "\" no existe en el contexto.");
      Log.error("Despachador.deJSP()", "\t\tGenerando respuesta al cliente:");
      Log.error("Despachador.deJSP()", "\t\tCódigo de estado HTTP: 500");
      Log.error("Despachador.deJSP()", "\t\tCuerpo de respuesta: /WEB-INF/jsps/500.jsp");
      response.setStatus(500);
      ubicacionInternaAlContextoDelJSP = "/WEB-INF/jsps/500.jsp";
    }
    
    RequestDispatcher despachador = contextoDelServlet.getRequestDispatcher(ubicacionInternaAlContextoDelJSP);
    
    try {
      despachador.forward(request,response);
      Log.println("Despachador.deJSP()", "Despachando \"" + ubicacionInternaAlContextoDelJSP + "\"");
    } catch (ServletException e) {
      Log.excepcion("Despachador.deJSP()", e);
    } catch (IOException e) {
      Log.excepcion("Despachador.deJSP()", e);
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
      Log.excepcion("Despachador.deServlet()", e);
    } catch (IOException e) {
      Log.excepcion("Despachador.deServlet()", e);
    }
    
  }
}
