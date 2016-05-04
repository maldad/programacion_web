package org.bitbucket.VasquezMartinezAgustin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HtmlDinamicoServlet")
public class HtmlDinamicoServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter salida = response.getWriter();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE ',' d 'de' MMMM 'del' yyyy", new Locale("es", "MX"));
    String fecha = formatoFecha.format(new Date());
    SimpleDateFormat formatoHora = new SimpleDateFormat("H:mm:ss a", new Locale("es", "MX"));
    String hora = formatoHora.format(new Date());
    Random numeroAleatorio = new Random();
    String documentoHtml = "<!DOCTYPE html>" + 
        "<html>" +
          "<head>" +
            "<meta charset=\"UTF-8\">" +
            "<title>HtmlDinamicoServlet</title>" +
            "<link rel=\"stylesheet\" href=\"assets/css/normalize.css\">" +
            "<link rel=\"stylesheet\" href=\"assets/css/main.css\">" +
          "</head>" +
          "<body>" +
            "<div class=\"contenedor\">" +
              "<div class=\"cabecera\">" +
                "<h1>HtmlDinamicoServlet</h1>" +
              "</div>" +
              "<div class=\"menu\">" +
                "<ul>" +
                  "<li><a href='.'>Inicio</a></li>" +
                  "<li><a href=\"HtmlDinamicoServlet\">HtmlDinamicoServlet</a></li>" +
                  "<li><a href='HtmlFormularioServlet'>HtmlFormularioServlet</a></li>" +
                "</ul>" +
              "</div>" +
              "<div class=\"cuerpo\">" +
                "<p>Fecha: " + fecha + " </p>" +
                "<p>Hora: " + hora + " </p>" +
                "<p>Número aleatorio: " + numeroAleatorio.nextInt() + "</p>" +
              "</div>" +
            "</div>" +
          "</body>" +
        "</html>";
    salida.println(documentoHtml);
  }
} 