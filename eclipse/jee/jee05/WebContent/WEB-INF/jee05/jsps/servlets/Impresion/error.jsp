<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><!DOCTYPE html>
<%@ page import="jee05.utilidades.Log" %>
<%
  Log.println("jsps/servlets/Impresion/error.jsp", "Generando documento HTML...");
%>
<html>
<head>
  <meta charset="UTF-8">
  <title>Impresión - Error</title>
  <link rel="stylesheet" href="assets/css/normalize.css" />
  <link rel="stylesheet" href="assets/css/main.css" />
</head>
<body>
  <h1>Error de Impresión</h1>
  <p>
    No es posible generar una respuesta en el formato solicitado<br>
    <a href="/jee05/index.html">Regresar</a>
  </p>
</body>
</html>
<%
  Log.println("jsps/servlets/Impresion/error.jsp", "Documento HTML generado.");
%>