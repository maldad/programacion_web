<%@ page language="java" contentType="application/json" pageEncoding="UTF-8"%>{
  "TablaPrueba": [
<%@ page import="jee05.utilidades.Log" %>
<%@ page import="jee05.tablasenbasedadatos.TablaPrueba" %>
<%@ page import="jee05.tablasenbasedadatos.TuplaTablaPrueba" %>
<%
Log.println("jsps/clases/RespuestaJSON/generar.jsp", "Generando documento JSON...");
TablaPrueba tablaPrueba = (TablaPrueba)request.getAttribute("tablaPrueba");
String coma = ",";
for (int i = 0; i < tablaPrueba.obtenerCantidadDetuplas(); i++) {
  TuplaTablaPrueba tupla = tablaPrueba.obtenerTuplaEnIndice(i);
  if (i == tablaPrueba.obtenerCantidadDetuplas() - 1) {
    coma = "";
  }
%>
    {
      "id": <%= tupla.getId() %>,
      "a": "<%= tupla.getA() %>",
      "b": "<%= tupla.getB() %>",
      "c": "<%= tupla.getC() %>",
      "d": <%= tupla.getD() %>,
      "e": <%= tupla.isE() %>,
      "f": "<%= tupla.getF() %>"
    }<%= coma %>
<%
}
%>
]}
<%
  Log.println("jsps/clases/RespuestaJSON/generar.jsp", "Documento JSON generado.");
%>