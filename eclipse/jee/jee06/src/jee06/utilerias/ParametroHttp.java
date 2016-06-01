package jee06.utilerias;

import javax.servlet.http.HttpServletRequest;

public final class ParametroHttp {
  
  public static final String deGET(
      HttpServletRequest request,
      String llave) {
    String valor = "";
    if (request.getParameter(llave) != null) {
      valor = request.getParameter(llave);
    }
    return valor;
  }
  
  public static final String dePOST(
      HttpServletRequest request,
      String llave) {
    String valor = "";
    if (request.getParameter(llave) != null) {
      valor = request.getParameter(llave);
    }
    return valor;
  }
}
