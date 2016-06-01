package jee06.clases;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jee06.utilerias.Despachador;
import jee06.utilerias.Log;

public final class Inicio {
  public static final void metodoPorDefault(
      HttpServletRequest request,
      HttpServletResponse response) {
    Log.println("Inicio.metodoPorDefault()", "...");
    Despachador.deJSP(request, response, "/clases/Inicio/index.jsp");
  }
}
