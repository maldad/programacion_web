<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><!DOCTYPE html>
<%@ page import="jee05.utilidades.Log" %>
<%@ page import="jee05.tablasenbasedadatos.TablaPrueba" %>
<%@ page import="jee05.tablasenbasedadatos.TuplaTablaPrueba" %>
<%
  Log.println("jsps/clases/RespuestaHTML/generar.jsp", "Generando documento HTML...");
  TablaPrueba tablaPrueba = (TablaPrueba)request.getAttribute("tablaPrueba");
%>
<html>
<head>
  <meta charset="UTF-8">
  <title>Impresión en formato HTML</title>
  <link rel="stylesheet" href="assets/css/normalize.css" />
  <link rel="stylesheet" href="assets/css/main.css" />
</head>
<body>
<a href="/jee05/index.html">Regresar</a>
<hr>
<table class="tuplaTabla">
  <caption>TablaPrueba</caption>
  <thead>
    <tr>
      <th>#</th>
      <th>id</th>
      <th>a</th>
      <th>b</th>
      <th>c</th>
      <th>d</th>
      <th>e</th>
      <th>f</th>
    </tr>
  </thead>
  <tbody>
<%
for (int i = 0; i < tablaPrueba.obtenerCantidadDetuplas(); i++) {
  TuplaTablaPrueba tupla = tablaPrueba.obtenerTuplaEnIndice(i);
%>
  <tr>
    <td><%= (i + 1) %></td>
    <td><%= tupla.getId() %></td>
    <td><%= tupla.getA() %></td>
    <td><%= tupla.getB() %></td>
    <td><%= tupla.getC() %></td>
    <td><%= tupla.getD() %></td>
    <td><%= tupla.isE() %></td>
    <td><%= tupla.getF() %></td>
  </tr>
<%
}
%>
  </tbody>
</table>
</body>
</html>
<%
  Log.println("jsps/clases/RespuestaHTML/generar.jsp", "Documento HTML generado.");
%>