<%@ page language="java" pageEncoding="UTF-8" %><!DOCTYPE html>
<%
  request.setCharacterEncoding("UTF-8");
  String nombre = request.getParameter("NOMBRE");
  String apellidos = request.getParameter("APELLIDOS");
  String edad = request.getParameter("EDAD");
  String correo_electronico = request.getParameter("CORREO-ELECTRONICO");
%>
<html>
<head>
<meta charset="UTF-8">
<title>HtmlFormularioJSP</title>
<link rel="stylesheet" href="assets/css/normalize.css">
<link rel="stylesheet" href="assets/css/main.css">
</head>
<body>
  <div class="contenedor">
    <div class="cabecera">
      <h1>HtmlFormularioJSP</h1>
    </div>
    <div class="menu">
      <ul>
        <li><a href='.'>Inicio</a></li>
        <li><a href="HtmlDinamicoJSP.jsp">HtmlDinamicoJSP</a></li>
        <li><a href='HtmlFormularioJSP.jsp'>HtmlFormularioJSP</a></li>
      </ul>
    </div>
    <div class="cuerpo">
      <ul class="datos-personales">
        <li>Datos Personales
          <ul class="datos-personales">
            <li>Nombre: <span><%= nombre %></span></li>
            <li>Apellidos: <span><%= apellidos %></span></li>
            <li>Edad: <span><%= edad %></span></li>
            <li>Correo electrónico: <span><%= correo_electronico %></span></li>
          </ul>
        </li>
      </ul>
      <p class="regresar">
        <a href="HtmlFormularioJSP.jsp">Regresar</a>
      </p>
    </div>
  </div>
</body>
</html>
