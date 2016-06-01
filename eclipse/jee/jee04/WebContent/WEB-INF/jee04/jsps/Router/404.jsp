<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><!DOCTYPE html>
<%@ page import="jee04.utilidades.Log" %>
<%
  Log.println("jsps/Router/404.jsp", "♘ Generando documento HTML...");
%>
<html>
<head>
  <meta charset="UTF-8">
  <title>Error 404 de HTTP</title>
  <link rel="stylesheet" href="assets/css/normalize.css" />
  <link rel="stylesheet" href="assets/css/main.css" />
  <link rel="stylesheet" href="assets/css/404.css" />
  <link rel="icon" href="assets/ico/Artua-Mac-Chess.ico" />
</head>
<body>
<div class="contenedor">
  <h1>Error 404 de HTTP</h1>
  <hr>
  <p>
    El recurso solicitado no ha sido encontrado<br>
    <a href="/jee04/">Acceder a /jee04/</a>
  </p>
</div>
</body>
</html>
<%
  Log.println("jsps/Router/404.jsp", "♘ Documento HTML generado.");
%>