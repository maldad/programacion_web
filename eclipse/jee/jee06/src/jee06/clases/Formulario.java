package jee06.clases;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jee06.utilerias.Despachador;
import jee06.utilerias.Log;
import jee06.utilerias.ParametroHttp;
import jee06.utilerias.RedireccionamientoHttp;

public final class Formulario {
  public static final void metodoPorDefault(
      HttpServletRequest request,
      HttpServletResponse response) {
	  Log.println("Formulario.metodoPorDefault()", "...");
	  RedireccionamientoHttp.a(request, response, "/jee06/router?clase=Inicio");
  	}
  
  public static final void mostrar(
      HttpServletRequest request,
      HttpServletResponse response) {
	  Log.println("Formulario.mostrar()", "...");
	  Despachador.deJSP(request, response, "/clases/Formulario/mostrar.jsp");
  	}
  
  public static final void procesar(
      HttpServletRequest request,
      HttpServletResponse response) {
	  Log.println("Formulario.procesar()", "...");
    
    String llave1  = ParametroHttp.dePOST(request, "llave1");
    String llave2  = ParametroHttp.dePOST(request, "llave2");
    String llave3  = ParametroHttp.dePOST(request, "llave3");
    String llave4  = ParametroHttp.dePOST(request, "llave4");
    String llave5  = ParametroHttp.dePOST(request, "llave5");
    String llave6  = ParametroHttp.dePOST(request, "llave6");
    String llave7  = ParametroHttp.dePOST(request, "llave7");
    String llave8  = ParametroHttp.dePOST(request, "llave8");
    String llave9  = ParametroHttp.dePOST(request, "llave9");
    String llave10 = ParametroHttp.dePOST(request, "llave10");
    String llave11 = ParametroHttp.dePOST(request, "llave11");
    String llave12 = ParametroHttp.dePOST(request, "llave12");
    String llave13 = ParametroHttp.dePOST(request, "llave13");
    String llave14 = ParametroHttp.dePOST(request, "llave14");
    String llave15 = ParametroHttp.dePOST(request, "llave15");
    
    String added1 = ParametroHttp.dePOST(request, "added1"); 
    String areaDeTexto = ParametroHttp.dePOST(request, "areaDeTexto");
    String biketype = ParametroHttp.dePOST(request, "biketype");
    String edad = ParametroHttp.dePOST(request, "edad");
    String color = ParametroHttp.dePOST(request, "color");
    /*
     * ¿Alguna validación que sea requerida?
     * Esto se ocupa para evitar los valores null, ya que el metodo
     * dePOST, regresa una cadena vacia en caso de que la llave encontrarda
     * sea null
     */
    
    request.setAttribute("llave1", llave1);
    request.setAttribute("llave2", llave2);
    request.setAttribute("llave3", llave3);
    request.setAttribute("llave4", llave4);
    request.setAttribute("llave5", llave5);
    request.setAttribute("llave6", llave6);
    request.setAttribute("llave7", llave7);
    request.setAttribute("llave8", llave8);
    request.setAttribute("llave9", llave9);
    request.setAttribute("llave10", llave10);
    request.setAttribute("llave11", llave11);
    request.setAttribute("llave12", llave12);
    request.setAttribute("llave13", llave13);
    request.setAttribute("llave14", llave14);
    request.setAttribute("llave15", llave15);
    
    request.setAttribute("added1", added1);
    request.setAttribute("areaDeTexto", areaDeTexto);
    request.setAttribute("biketype", biketype);
    request.setAttribute("edad", edad);
    request.setAttribute("color", color);
    
    Despachador.deJSP(request, response, "/clases/Formulario/procesar.jsp");
  }
}
