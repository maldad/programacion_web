package org.bitbucket.VasquezMartinezAgustin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HtmlFormularioServlet")
public class HtmlFormularioServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter salida = response.getWriter();
    String documentoHtml = "<!DOCTYPE html>" + 
        "<html>" +
          "<head>" +
            "<meta charset=\"UTF-8\">" +
            "<title>HtmlFormularioServlet</title>" +
            "<link rel=\"stylesheet\" href=\"assets/css/normalize.css\">" +
            "<link rel=\"stylesheet\" href=\"assets/css/main.css\">" +
          "</head>" +
          "<body>" +
            "<div class=\"contenedor\">" +
              "<div class=\"cabecera\">" +
                "<h1>HtmlFormularioServlet</h1>" +
              "</div>" +
              "<div class=\"menu\">" +
                "<ul>" +
                  "<li><a href='.'>Inicio</a></li>" +
                  "<li><a href=\"HtmlDinamicoServlet\">HtmlDinamicoServlet</a></li>" +
                  "<li><a href='HtmlFormularioServlet'>HtmlFormularioServlet</a></li>" +
                "</ul>" +
              "</div>" +
              "<div class=\"cuerpo\">" +
                "<form action=\"HtmlFormularioServlet\" method=\"post\" class=\"formulario\">" +
                  "<fieldset>" +
                    "<legend>Datos Personales</legend>" +
                    "<div>" +
                      "<label for=\"NOMBRE\">Nombre</label>" +
                      "<input type=\"text\" name=\"NOMBRE\" value=\"\" />" +
                    "</div>" +
                    "<div>" +
                      "<label for=\"APELLIDOS\">Apellidos</label>" +
                      "<input type=\"text\" name=\"APELLIDOS\" value=\"\" />" +
                    "</div>" +
                    "<div>" +
                      "<label for=\"EDAD\">Edad</label>" +
                      "<input type=\"text\" name=\"EDAD\" value=\"\" />" +
                    "</div>" +
                    "<div>" +
                      "<label for=\"CORREO-ELECTRONICO\">Correo electrónico</label>" +
                      "<input type=\"email\" name=\"CORREO-ELECTRONICO\" value=\"\"  />" +
                    "</div>" +
                    "<div>" +
                      "<input type=\"submit\" value=\"Continuar\" class=\"enviar\" />" +
                    "</div>" +
                  "</fieldset>" +
                "</form>" +
              "</div>" +
            "</div>" +
          "</body>" +
        "</html>";
    salida.println(documentoHtml);
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    String nombre = request.getParameter("NOMBRE");
    String apellidos = request.getParameter("APELLIDOS");
    String edad = request.getParameter("EDAD");
    String correo_electronico = request.getParameter("CORREO-ELECTRONICO");
    PrintWriter salida = response.getWriter();
    String documentoHtml = "<!DOCTYPE html>" +
        "<html>" +
          "<head>" +
            "<meta charset=\"UTF-8\">" +
            "<title>HtmlFormularioServlet</title>" +
            "<link rel=\"stylesheet\" href=\"assets/css/normalize.css\">" +
            "<link rel=\"stylesheet\" href=\"assets/css/main.css\">" +
          "</head>" +
          "<body>" +
            "<div class=\"contenedor\">" +
              "<div class=\"cabecera\">" +
                "<h1>HtmlFormularioServlet</h1>" +
              "</div>" +
              "<div class=\"menu\">" +
                "<ul>" +
                  "<li><a href='.'>Inicio</a></li>" +
                  "<li><a href=\"HtmlDinamicoServlet\">HtmlDinamicoServlet</a></li>" +
                  "<li><a href=\"HtmlFormularioServlet\">HtmlFormularioServlet</a></li>" +
                "</ul>" +
              "</div>" +
              "<div class=\"cuerpo\">" +
                "<ul class=\"datos-personales\">Datos Personales" +
                  "<li>Nombre: <span>" + nombre + "</span></li>" +
                  "<li>Apellidos: <span>" + apellidos + "</span></li>" +
                  "<li>Edad: <span>" + edad + "</span></li>" +
                  "<li>Correo electrónico: <span>" + correo_electronico + "</span></li>" +
                "</ul>" +
                "<p class=\"regresar\">" +
                  "<a href=\"HtmlFormularioServlet\">Regresar</a>" +
                "</p>" +
              "</div>" +
            "</div>" +
          "</body>" +
        "</html>";
    salida.println(documentoHtml);
  }
}