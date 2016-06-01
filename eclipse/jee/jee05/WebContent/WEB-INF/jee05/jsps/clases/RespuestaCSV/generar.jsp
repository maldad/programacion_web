<%@ page language="java" contentType="text/plain" pageEncoding="UTF-8"%>id|a|b|c|d|e|f
<%@ page import="jee05.utilidades.Log" %>
<%@ page import="jee05.tablasenbasedadatos.TablaPrueba" %>
<%@ page import="jee05.tablasenbasedadatos.TuplaTablaPrueba" %>
<%
Log.println("jsps/clases/RespuestaCSV/generar.jsp", "Generando documento CSV...");
TablaPrueba tablaPrueba = (TablaPrueba)request.getAttribute("tablaPrueba");
String separador = "|";
for (int i = 0; i < tablaPrueba.obtenerCantidadDetuplas(); i++) {
  TuplaTablaPrueba tupla = tablaPrueba.obtenerTuplaEnIndice(i);
  String linea = tupla.getId() + separador + tupla.getA() + separador + tupla.getB() + separador + tupla.getC() + separador + tupla.getD() + separador + tupla.isE() + separador + tupla.getF();
%>
<%= linea %>
<%
}
%>
<%
Log.println("jsps/clases/RespuestaCSV/generar.jsp", "Documento CSV generado.");
%>