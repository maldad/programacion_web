<%@ page language="java" contentType="application/vnd.ms-excel" pageEncoding="UTF-8"%>
<%@ page import="jee05.utilidades.Log" %>
<%@ page import="jee05.tablasenbasedadatos.TablaPrueba" %>
<%@ page import="jee05.tablasenbasedadatos.TuplaTablaPrueba" %>
<%
  response.setHeader("Content-Disposition", "inline; filename=" + "ImpresionEnFormatoExcel2003.xls");
  Log.println("jsps/clases/RespuestaHTML/generar.jsp", "Generando documento XLS...");
  TablaPrueba tablaPrueba = (TablaPrueba)request.getAttribute("tablaPrueba");
%>
<table>
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
</table>
<%
  Log.println("jsps/clases/RespuestaHTML/generar.jsp", "Documento XLS generado.");
%>