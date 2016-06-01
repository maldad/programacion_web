package jee04.clases;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jee04.utilidades.Log;

public final class Inicio {

  public static final void metodoPorDefault(
      HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    Log.println("clases/Inicio.metodoPorDefault()", "Atendiendo solicitud...");
    
    Log.println("clases/Inicio.metodoPorDefault()", "Cuerpo de respuesta = jsps/Inicio/metodoPorDefault.jsp");
    ServletContext contextoDelServlet = request.getServletContext();
    RequestDispatcher despachador = contextoDelServlet.getRequestDispatcher(
        "/WEB-INF/jee04/jsps/Inicio/metodoPorDefault.jsp"
    );
    despachador.forward(request,response);
  }
  
}
