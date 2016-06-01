package jee05.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jee05.clases.RespuestaHTML;
import jee05.clases.RespuestaJSON;
import jee05.clases.RespuestaPDF;
import jee05.clases.RespuestaCSV;
import jee05.clases.RespuestaXLS;
import jee05.clases.RespuestaXML;
import jee05.utilidades.Despachador;
import jee05.utilidades.Log;

@WebServlet({ "/Impresion", "/impresion" })
public class Impresion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(
	    HttpServletRequest request,
	    HttpServletResponse response)
	        throws ServletException, IOException {
	  Log.println("Impresion.doGet()", "Solicitud de impresión recibida...");
	  
	  String formatoPorDefault = "html";
	  String enFormato = request.getParameter("enFormato");
	  if (enFormato == null) {
	    enFormato = formatoPorDefault;
	  }
	  
    Log.println("Impresion.doGet()", "Formato solicitado: " + enFormato);
    
	  switch (enFormato) {
      case "html":
        RespuestaHTML.generar(request, response);
        break;
      case "json":
        RespuestaJSON.generar(request, response);
        break;
      case "pdf":
        RespuestaPDF.generar(request, response);
        break;
      case "csv":
        RespuestaCSV.generar(request, response);
        break;
      case "xls":
        RespuestaXLS.generar(request, response);
        break;
      case "xml":
        RespuestaXML.generar(request, response);
        break;
      default:
        /* Se tienen dos opciones, uno decide que hacer */
        
        /* ##### 1. Se redirecciona al cliente a algún otro lado. */
        /*
        Log.println("Impresion.doGet()", "Error, no es posible generar una respuesta en formato " + enFormato);
        Log.println("Impresion.doGet()", "\tRedireccionando al cliente a: " + request.getContextPath() + "/index.html");
        response.sendRedirect(request.getContextPath() + "/index.html");
        */
        
        /* ##### 2. Se genera un documento HTML indicandole al usuario el problema detectado.
         * 
         *          El código de estado HTTP 406 de acuerdo a la Wikipedia indica:
         *              406 - Not Acceptable
         *              El servidor no es capaz de devolver los datos en ninguno de los formatos aceptados
         *              por el cliente, indicados por éste en la cabecera "Accept" de la petición.
        */
        response.setStatus(406);
        Despachador.deJSP(request, response, "/servlets/Impresion/error.jsp");
        break;
    }
	  
    Log.println("Impresion.doGet()", "Solicitud de impresión atendida.");
    Log.println("");
	}

}
