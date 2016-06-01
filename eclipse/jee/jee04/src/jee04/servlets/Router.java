package jee04.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jee04.clases.ClasePorDefault;
import jee04.clases.Inicio;
import jee04.clases.Prueba;
import jee04.utilidades.Log;
import jee04.utilidades.ParametroHttp;

@WebServlet(
    urlPatterns = {
        "/Router",
        "/router"
    }
)
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(
	    HttpServletRequest request,
	    HttpServletResponse response)
	        throws ServletException, IOException {
	  Log.solicitudHttp(request);
	  
    Log.println("servlets/Router.doGet()", "♞ Solicitud recibida.");
    Log.println("servlets/Router.doGet()", "♞ Determinando ruta...");
	  
	  String clase = ParametroHttp.deGET(request, "clase");
	  String metodo = ParametroHttp.deGET(request, "metodo");
	  String base = "";
	  String altura = "";
	  PrintWriter salida = response.getWriter();
	  
	  if (clase.equals("")) {
	    clase = "ClasePorDefault";
	  }
	  if (metodo.equals("")) {
	    metodo = "metodoPorDefault";
	  }
	  
    Log.println("servlets/Router.doGet()", "♞ Ruta = clases/" + clase + "." + metodo + "()");
    
    switch (clase) {
      case "Inicio":
        switch (metodo) {
          case "metodoPorDefault":
            Inicio.metodoPorDefault(request, response);
            break;
          default:
            Inicio.metodoPorDefault(request, response);
            break;
        }
        break;
      case "ClasePorDefault":
        switch (metodo) {
          case "metodoPorDefault":
            ClasePorDefault.metodoPorDefault(request, response);
            break;
          default:
            ClasePorDefault.metodoPorDefault(request, response);
            break;
        }
      case "Triangulo":
    	  switch(metodo){
    	  	case "calcularArea":
    	  		//Triangulo.calcularArea(request, response);
    	  		base = request.getParameter("base");
    	  		altura = request.getParameter("altura");
    	  		int b, a;
    	  		b = Integer.parseInt(base);
    	  		a = Integer.parseInt(altura);
    	  		salida.println("area: " + (b*a)/2 + " unidades cuadradas");
    	  }
      case "Prueba":
        switch(metodo){
            case "metodoPorDefault":
            	Prueba.metodoPorDefault(request, response);
            break;
            case "validaciones":
            	Prueba.validaciones(request, response);
            break;
          default:
            Prueba.metodoPorDefault(request, response);
            break;
        }
        break;
      default:
        Log.println("servlets/Router.doGet()", "♘ Ruta no valida.");
        
        Log.println("servlets/Router.doGet()", "♘ Respondiendo con código de estado HTTP 404 al cliente...");
        response.setStatus(404);
        
        Log.println("servlets/Router.doGet()", "♘ Cuerpo de respuesta = jsps/Router/404.jsp");
        ServletContext contextoDelServlet = request.getServletContext();
        RequestDispatcher despachador = contextoDelServlet.getRequestDispatcher(
            "/WEB-INF/jee04/jsps/Router/404.jsp"
        );
        despachador.forward(request,response);
        break;
    }
	  
    Log.println("servlets/Router.doGet()", "♞ Solicitud atendida.");
    Log.println("");
    
    ///////////////////////
    //ServletContext triangulo = request.getServletContext();
    //RequestDispatcher despachador = triangulo.getRequestDispatcher("triangulo.jsp");
    //despachador.forward(request,response);
    
	}

	protected void doPost(
	    HttpServletRequest request,
	    HttpServletResponse response)
	        throws ServletException, IOException {
	  Log.solicitudHttp(request);
	}
	
}
