package jee04.clases;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jee04.utilidades.Log;

public class ClasePorDefault {
  public static final void metodoPorDefault(
      HttpServletRequest request,
      HttpServletResponse response)
          throws IOException, ServletException {
    Log.println("clases/ClasePorDefault.metodoPorDefault()", "Atendiendo solicitud...");
    
    Log.println("clases/ClasePorDefault.metodoPorDefault()", "Respondiendo con código de estado HTTP 302 al cliente.");
    response.sendRedirect("/jee04/router?clase=Inicio");
  }
  
}
