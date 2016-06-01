<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><!DOCTYPE html>
<%@ page import="jee04.utilidades.Log" %>
<%
  Log.println("jsps/Inicio/metodoPorDefault.jsp", "Generando documento HTML...");
%>
<html>
<head>
  <meta charset="UTF-8">
  <title>Inicio</title>
  <link rel="stylesheet" href="assets/css/normalize.css" />
  <link rel="stylesheet" href="assets/css/main.css" />
  <link rel="icon" href="assets/ico/Artua-Mac-Chess.ico" />
</head>
<body>
  <h1>jsps/Inicio/metodoPorDefault.jsp</h1>
  <hr>
  <h2>Recursos estáticos</h2>
  <p>
    Estas solicitudes son atendidas directamente por <em>Apache Tomcat</em>
  </p>
  <ul>
    <li>
      <a href="/jee04">
        /jee04
      </a>
    </li>
    <li>
      <a href="/jee04/index.html">
        /jee04/index.html
      </a>
    </li>
    <li>
      <a href="/jee04/assets/css/main.css">
        /jee04/assets/css/main.css
      </a>
    </li>
    <li>
      <a href="/jee04/assets/css/404.css">
        /jee04/assets/css/404.css
      </a>
    </li>
    <li>
      <a href="/jee04/assets/ico/Fatcow-Farm-Fresh-Chess-horse.ico">
        /jee04/assets/ico/Fatcow-Farm-Fresh-Chess-horse.ico
      </a>
    </li>
  </ul>
  <h2>
    <em>Redireccionamientos</em>
    (<code>código de estado HTTP 302</code>)
  </h2>
  <p>
    Estas solicitudes son respondidas con un <em>redireccionamiento</em>
    por parte de la <em>clase de Java</em>: <code>jee04.clases.ClasePorDefault</code>
  </p>
  <ul>
    <li>
      <a href="/jee04/router">
        /jee04/router
      </a>
    </li>
    <li>
      <a href="/jee04/router?">
        /jee04/router?
      </a>
    </li>
    <li>
      <a href="/jee04/router?clase=">
        /jee04/router?clase=
      </a>
    </li>
    <li>
      <a href="/jee04/router?clase=&metodo=">
        /jee04/router?clase=&amp;metodo=
      </a>
    </li>
    <li>
      <a href="/jee04/router?clase=ClasePorDefault">
        /jee04/router?clase=ClasePorDefault
      </a>
    </li>
    <li>
      <a href="/jee04/router?clase=ClasePorDefault&metodo=metodoPorDefault">
        /jee04/router?clase=ClasePorDefault&amp;metodo=metodoPorDefault
      </a>
    </li>
    <li>
      <a href="/jee04/router?clase=ClasePorDefault&metodo=metodoY">
        /jee04/router?clase=ClasePorDefault&amp;metodo=metodoY
      </a>
    </li>
    <li>
      <a href="/jee04/router?metodo=metodoPorDefault">
        /jee04/router?metodo=metodoPorDefault
      </a>
    </li>
    <li>
      <a href="/jee04/router?metodo=otroMetodo">
        /jee04/router?metodo=otroMetodo
      </a>
    </li>
    <li>
      <a href="/jee04/router?llaveX=valorX&llaveY=valorY">
        /jee04/router?llaveX=valorX&amp;llaveY=valorY
      </a>
    </li>
    <li>
      <a href="/jee04/router?hola=mundo">
        /jee04/router?hola=mundo
      </a>
    </li>
  </ul>
  <h2>
    <em>Errores</em>
    (<code>código de estado HTTP 404</code>)
  </h2>
  <p>
    Estas solicitudes son respondidas con un <em>error</em>
    dado por el <em>servlet de Java</em>: <code>jee04.servlets.Router</code>
  </p>
  <ul>
    <li>
      <a href="/jee04/router?clase=ClaseQueNoExiste">
        /jee04/router?clase=ClaseQueNoExiste
      </a>
    </li>
    <li>
      <a href="/jee04/router?clase=OtraClase&metodo=conMetodoQueNoExiste">
        /jee04/router?clase=OtraClase&amp;metodo=conMetodoQueNoExiste
      </a>
    </li>
  </ul>
  <h2>
    <em>Errores</em>
    (<code>código de estado HTTP 404</code>)
  </h2>
  <p>
    Estas solicitudes son respondidas con un <em>error</em>
    dado por <em>Apache Tomcat</em> al no existir en el contexto, como
    recursos estáticos, servlets o jsps.
  </p>
  <ul>
    <li>
      <a href="/jee04/unRecursoQueNoExiste">
        /jee04/unRecursoQueNoExiste
      </a>
    </li>
    <li>
      <a href="/jee04/img/otro-recurso-que-no-existe.png">
        /jee04/img/otro-recurso-que-no-existe.png
      </a>
    </li>
    <li>
      <a href="/jee04/textos/un-recurso-mas-que-no-existe.txt">
        /jee04/textos/un-recurso-mas-que-no-existe.txt
      </a>
    </li>
  </ul>
  <h2>
    <em>Errores</em>
    (<code>código de estado HTTP 404</code>)
  </h2>
  <p>
    Estas solicitudes son respondidas con un <em>error</em>
    dado por <em>Apache Tomcat</em> aún cuando existen en el contexto.
  </p>
  <ul>
    <li>
      <a href="/jee04/META-INF/">
        /jee04/META-INF/MANIFEST.MF
      </a>
    </li>
    <li>
      <a href="/jee04/WEB-INF/web.xml">
        /jee04/WEB-INF/web.xml
      </a>
    </li>
    <li>
      <a href="/jee04/WEB-INF/jsps/Inicio/metodoPorDefault.jsp">
        /jee04/WEB-INF/jsps/Inicio/metodoPorDefault.jsp
      </a>
    </li>
    <li>
      <a href="/jee04/WEB-INF/jsps/Router/404.jsp">
        /jee04/WEB-INF/jsps/Router/404.jsp
      </a>
    </li>
  </ul>
</body>
</html>
<%
Log.println("jsps/Inicio/metodoPorDefault.jsp", "Documento HTML generado.");
%>