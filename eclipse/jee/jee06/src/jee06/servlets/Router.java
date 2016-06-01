package jee06.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jee06.clases.ClasePorDefault;
import jee06.clases.Formulario;
import jee06.clases.Inicio;
import jee06.utilerias.Log;
import jee06.utilerias.ParametroHttp;

@WebServlet({ "/Router", "/router" })
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(
	    HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	  Log.solicitudHttpGET(request);
	  
	  String clase = ParametroHttp.deGET(request, "clase");
	  String metodo = ParametroHttp.deGET(request, "metodo");
	  
	  /********************************************************/
	  /*** Tabla de enrutamiento para el método GET de HTTP ***/
	  /********************************************************/
	  switch (clase) {
      case "Inicio":
        Inicio.metodoPorDefault(request, response);
        break;
      case "Formulario":
        switch (metodo) {
          case "mostrar":
            Formulario.mostrar(request, response);
            break;
          default:
            Formulario.metodoPorDefault(request, response);
            break;
        }
        break;
      default:
        ClasePorDefault.metodoPorDefault(request, response);
        break;
    }
	  Log.println();
	}
	
	protected void doPost(
	    HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	  Log.solicitudHttpPOST(request);
	  
	  String clase = ParametroHttp.dePOST(request, "clase");
    String metodo = ParametroHttp.dePOST(request, "metodo");
	  
	  /*********************************************************/
    /*** Tabla de enrutamiento para el método POST de HTTP ***/
    /*********************************************************/
	  switch (clase) {
      case "Formulario":
        switch (metodo) {
          case "procesar":
            Formulario.procesar(request, response);
            break;
          default:
            Formulario.metodoPorDefault(request, response);
            break;
        }
        break;
      default:
        ClasePorDefault.metodoPorDefault(request, response);
        break;
    }
	  Log.println();
	}

}
