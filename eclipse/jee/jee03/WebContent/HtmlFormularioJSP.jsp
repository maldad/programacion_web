<%@ page language="java" pageEncoding="UTF-8" %><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HtmlFormularioJSP</title>
<link rel="stylesheet" href="assets/css/normalize.css">
<link rel="stylesheet" href="assets/css/main.css">
</head>
<body>
  <div class="contenedor">
    <div class="cabecera">
      <h1>HtmlFormularioJSP</h1>
    </div>
    <div class="menu">
      <ul>
        <li><a href='.'>Inicio</a></li>
        <li><a href="HtmlDinamicoJSP.jsp">HtmlDinamicoJSP</a></li>
        <li><a href='HtmlFormularioJSP.jsp'>HtmlFormularioJSP</a></li>
      </ul>
    </div>
    <div class="cuerpo">
      <form action="HtmlFormularioPostJSP.jsp" method="post" class="formulario">
        <fieldset>
          <legend>Datos Personales</legend>
          <div>
            <label for="NOMBRE">Nombre</label>
            <input type="text" name="NOMBRE" value="" />
          </div>
          <div>
            <label for="APELLIDOS">Apellidos</label>
            <input type="text" name="APELLIDOS" value="" />
          </div>
          <div>
            <label for="EDAD">Edad</label>
            <input type="text" name="EDAD" value="" />
          </div>
          <div>
            <label for="CORREO-ELECTRONICO">Correo electrónico</label>
            <input type="email" name="CORREO-ELECTRONICO" value=""  />
          </div>
          <div>
            <input type="submit" value="Continuar" class="enviar" />
          </div>
        </fieldset>
      </form>
    </div>
  </div>
</body>
</html>