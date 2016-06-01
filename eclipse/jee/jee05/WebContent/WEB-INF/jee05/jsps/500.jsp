<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><!DOCTYPE html>
<%@ page import="jee05.utilidades.Log" %>
<%
  Log.println("jsps/500.jsp", "Generando documento HTML...");
%>
<html>
<head>
  <meta charset="UTF-8">
  <title>Error 505 de HTTP</title>
  <link rel="stylesheet" href="assets/css/normalize.css" />
  <link rel="stylesheet" href="assets/css/main.css" />
  <link rel="stylesheet" href="assets/css/500.css" />
</head>
<body>
<div class="contenedor">
  <h1>Error 500 de HTTP</h1>
  <hr>
  <p>
    Error interno en el servidor.<br>
    <a href="/jee05/">Acceder a /jee05/</a>
  </p>
</div>
</body>
</html>
<%
  Log.println("jsps/500.jsp", "Documento HTML generado.");
%>