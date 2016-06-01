<%@ page language="java" contentType="application/xml" pageEncoding="UTF-8"%><TablaPrueba>
<%@ page import="jee05.utilidades.Log" %>
<%@ page import="jee05.tablasenbasedadatos.TablaPrueba" %>
<%@ page import="jee05.tablasenbasedadatos.TuplaTablaPrueba" %>
<%
  Log.println("jsps/clases/RespuestaXML/generar.jsp", "Generando documento XML...");
  TablaPrueba tablaPrueba = (TablaPrueba)request.getAttribute("tablaPrueba");
%>
<%
for (int i = 0; i < tablaPrueba.obtenerCantidadDetuplas(); i++) {
  TuplaTablaPrueba tupla = tablaPrueba.obtenerTuplaEnIndice(i);
%>
  <Tupla>
    <id><%= tupla.getId() %></id>
    <a><%= tupla.getA() %></a>
    <b><%= tupla.getB() %></b>
    <c><%= tupla.getC() %></c>
    <d><%= tupla.getD() %></d>
    <e><%= tupla.isE() %></e>
    <f><%= tupla.getF() %></f>
  </Tupla>
<%
}
%>
</TablaPrueba>
<%
  Log.println("jsps/clases/RespuestaHTML/generar.jsp", "Documento XML generado.");
%>