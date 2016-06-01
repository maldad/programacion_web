package jee06.clases;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jee06.utilerias.Log;
import jee06.utilerias.RedireccionamientoHttp;

public final class ClasePorDefault {
  public static final void metodoPorDefault(
      HttpServletRequest request,
      HttpServletResponse response) {
    Log.println("ClasePorDefault.metodoPorDefault()", "...");
    RedireccionamientoHttp.a(request, response, "/jee06/router?clase=Inicio");
  }
}
