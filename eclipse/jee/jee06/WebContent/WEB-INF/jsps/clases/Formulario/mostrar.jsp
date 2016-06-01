<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><!DOCTYPE html>
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
    <%// este es un comentario equis %>
    <form method="post" action="/jee06/router?clase=Formulario&metodo=procesar" name="formulario-mostrado">
      <fieldset>
        <legend>mostrar.jsp</legend>
	      <label> llave1
	        <input type="text"     name="llave1"  value="">
	      </label>
	      <label> llave2
	        <input type="color"    name="llave2"  value="">
          </label>
          <label> llave3
	        <input type="date"     name="llave3"  value="">
          </label>
          <label> llave4
	        <input type="datetime" name="llave4"  value="">
		  </label>
        <label> llave5
	        <input type="email"    name="llave5"  value="">
        </label>
        <label> llave6
	        <input type="month"    name="llave6"  value="">
        </label>
        <label> llave7
	        <input type="number"   name="llave7"  value="">
        </label>
        <label> llave8
	        <input type="range"    name="llave8"  value="">
        </label>
        <label> llave9
	        <input type="search"   name="llave9"  value="">
        </label>
        <label> llave10
	        <input type="tel"      name="llave10" value="">
        </label>
        <label> llave11
	        <input type="time"     name="llave11" value="">
        </label>
        <label> llave12
	        <input type="url"      name="llave12" value="">
        </label>
        <label> llave13
	        <input type="week"     name="llave13" value="">
        </label>
        <label> llave14
              <input type="password" name="llave14" value="">
        </label>
        <label> llave15
          <input type="hidden" name="llave15" value="OCULTO VISUALMENTE AL USUARIO">
        </label>
        <label> agregado1
            <input type="text" name="added1" placeholder="agregado1" value="">
        </label>
        </fieldset>
        <fieldset>
            <legend>Added: may 29, 2016</legend>
            <label for="textarea">Area de texto</label>
            <textarea name="areaDeTexto" cols="30" rows="5"></textarea>

            <label for="biketype">Tipos de bicicleta</label>
                This list shows a value each time and only let choose one of them 
                <br>
            <select name="biketype">
                <option value="" selected="selected">Selecciona una</option>
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
    </form> //cerrando el form
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

