<%@ page language="java" pageEncoding="UTF-8" %><!DOCTYPE html>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Locale" %>
<%@ page import="java.util.Random" %>
<%!
  SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE ',' d 'de' MMMM 'del' yyyy", new Locale("es", "MX"));
  String fecha = formatoFecha.format(new Date());
  SimpleDateFormat formatoHora = new SimpleDateFormat("H:mm:ss a", new Locale("es", "MX"));
  String hora = formatoHora.format(new Date());
  Random numeroAleatorio = new Random();
%>
<html>
<head>
<meta charset="UTF-8">
<title>HtmlDinamicoJSP</title>
<link rel="stylesheet" href="assets/css/normalize.css">
<link rel="stylesheet" href="assets/css/main.css">
</head>
<body>
  <div class="contenedor">
    <div class="cabecera">
      <h1>HtmlDinamicoJSP</h1>
    </div>
    <div class="menu">
      <ul>
        <li><a href='.'>Inicio</a></li>
        <li><a href="HtmlDinamicoJSP.jsp">HtmlDinamicoJSP</a></li>
        <li><a href='HtmlFormularioJSP.jsp'>HtmlFormularioJSP</a></li>
      </ul>
    </div>
    <div class="cuerpo">
      <p>Fecha: <%= fecha %></p>
      <p>Hora: <%= hora %></p>
      <p>Número aleatorio: <%= numeroAleatorio.nextInt() %></p>
    </div>
  </div>
</body>
</html>