package jee06.utilerias;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class RedireccionamientoHttp {
  public static final void a(
      HttpServletRequest request,
      HttpServletResponse response,
      String url) {
    try {
      response.sendRedirect(url);
      Log.println("RedireccionamientoHttp.a()", "Redireccionando al cliente a " + url);
    } catch (IOException e) {
      Log.excepcion("RedireccionamientoHttp.a()", e);
    }
  }
}
