<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><!DOCTYPE html>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%
String llave1 = (String)request.getAttribute("llave1");
String llave2 = (String)request.getAttribute("llave2");
String llave3 = (String)request.getAttribute("llave3");
String llave4 = (String)request.getAttribute("llave4");
String llave5 = (String)request.getAttribute("llave5");
String llave6 = (String)request.getAttribute("llave6");
String llave7 = (String)request.getAttribute("llave7");
String llave8 = (String)request.getAttribute("llave8");
String llave9 = (String)request.getAttribute("llave9");
String llave10 = (String)request.getAttribute("llave10");
String llave11 = (String)request.getAttribute("llave11");
String llave12 = (String)request.getAttribute("llave12");
String llave13 = (String)request.getAttribute("llave13");
String llave14 = (String)request.getAttribute("llave14");
String llave15 = (String)request.getAttribute("llave15");

String areaDeTexto = (String)request.getAttribute("areaDeTexto");
String biketype = (String)request.getAttribute("biketype");
String edad = (String)request.getAttribute("edad");
String color = (String)request.getAttribute("color");
String added1 = (String)request.getAttribute("added1");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
<link rel="stylesheet" href="/jee06/assets/css/normalize.css">
<link rel="stylesheet" href="/jee06/assets/css/main.css">
<link rel="stylesheet" href="/jee06/assets/css/formulario.css">
</head>
<body>
  <header>
    <h1>Inicio</h1>
    <nav>
      <ul>
        <li><a href="/jee06/router?clase=Inicio"><span>Inicio</span></a></li>
        <li><a href="/jee06/router?clase=Formulario&metodo=mostrar">Formulario</a></li>
      </ul>
    </nav>
  </header>
  <section>
    <form method="post" action="/jee06/router?clase=Formulario&metodo=procesar" name="formulario-mostrado">
      <fieldset>
        <legend>procesar.jsp</legend>
	      <label> llave1
	        <input type="text"     name="llave1"  value="<%= llave1 %>">
	      </label>
	      <label> llave2
	        <input type="color"    name="llave2"  value="<%= llave2 %>">
	      </label>
	      <label> llave3
	        <input type="date"     name="llave3"  value="<%= llave3 %>">
	      </label>
	      <label> llave4
	        <input type="datetime" name="llave4"  value="<%= llave4 %>">
	      </label>
	      <label> llave5
	        <input type="email"    name="llave5"  value="<%= llave5 %>">
	      </label>
	      <label> llave6
	        <input type="month"    name="llave6"  value="<%= llave6 %>">
	      </label>
	      <label> llave7
	        <input type="number"   name="llave7"  value="<%= llave7 %>">
	      </label>
	      <label> llave8
	        <input type="range"    name="llave8"  value="<%= llave8 %>">
	      </label>
	      <label> llave9
	        <input type="search"   name="llave9"  value="<%= llave9 %>">
	      </label>
	      <label> llave10
	        <input type="tel"      name="llave10" value="<%= llave10 %>">
	      </label>
	      <label> llave11
	        <input type="time"     name="llave11" value="<%= llave11 %>">
	      </label>
	      <label> llave12
	        <input type="url"      name="llave12" value="<%= llave12 %>">
	      </label>
	      <label> llave13
	        <input type="week"     name="llave13" value="<%= llave13 %>">
	      </label>
	      <label> llave14
          <input type="password" name="llave14" value="<%= llave14 %>">
        </label>
        <label> llave15
          <input type="hidden" name="llave15" value="<%= llave15 %>">
        </label>
        <label> agregado1
            <input type="text" name="added1" value="<%= added1 %>">
        </label>
      </fieldset>
      
      <fieldset>
            <legend>Added: may 29, 2016</legend>
            <label for="textarea">Area de texto</label>
            <textarea name="areaDeTexto" cols="30" rows="5">
                <%= areaDeTexto %>
            </textarea>
            <%// <element>valor a mostrar> %>
            <%// <textarea>valor a mostrar</textarea> %>
            <label for="biketype">Tipos de bicicleta</label>
                This list shows a value each time and only let choose one of them 
                <br>
            <select name="biketype">
            	<option value="" selected="selected"><%= biketype %></option>
            	<option value="Mountain bike">Mountain bike</option>
                <option value="Ruta">Ruta</option>
                <option value="Fixie">Fixie</option>
                <option value="BMX">BMX</option>
                <option value="Hybrid">Hybrid</option>
            </select>

            <label for="edad">Edad del usuario</label>
                This list shows several values at time and only let choose one
                <br>
            <select name="edad" size="4">
            	<option value = "" selected="selected"><%= edad %></option>
            	<option value="20">20</option>
                <option value="21">21</option>
                <option value="22">22</option>
                <option value="23">23</option>
                <option value="24">24</option>
                <option value="25">25</option>
                <option value="26">26</option>
            </select>
			
			<label for="color">Colores</label>
			This list shows several values and let choose several too
			<br>
			(use Ctrl + click for it)
			<br>
			<select name="color" size="5" multiple="multiple">
  				<option value="" selected="selected"><%= color %></option>
  				<option value="Cyan">Cyan</option>
  				<option value="Magenta">Magenta</option>
  				<option value="Yellow">Yellow</option>
  				<option value="Key">Key</option>
			</select>
        </fieldset>
      
      <fieldset>
      	<legend>Flow control</legend>
        <button type="submit" name="boton-de-submit" value="">Procesar</button>
        <button type="reset" name="boton-de-reset" value="">Reset</button>
      </fieldset>
    </form>
  </section>
  <footer>
    <nav>
      <ul>
        <li><a href="/jee06/router?clase=Inicio"><span>Inicio</span></a></li>
        <li><a href="/jee06/router?clase=Formulario&metodo=mostrar">Formulario</a></li>
      </ul>
    </nav>
  </footer>
</body>
</html>