<%-- 
    Document   : index
    Created on : 6/07/2023, 08:22:17 PM
    Author     : EQUIPO
--%>

   <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<link rel="stylesheet" href="css/index.css"/>
</head>
<body>
<div class="cuerpo">

<header>
<img src="img/colegio_banner.jpg" alt="no carga">
</header>

<nav>

</nav>

<section>


<article>

<fieldset>
<legend>Registrar clientes</legend>

<form action="Svclientes" method="POST">
<label for="txtCedula">Cedula:</label><br>
<input type="number" id="txtCedula" name="cedula" ><br>
<label for="txtNombres">Nombres:</label><br>
<input type="text" id="txtNombres" name="nombres"><br>
<label for="txtApellidos">Apellidos:</label><br>
<input type="text" id="txtApellidos" name="apellidos" ><br>
<label for="txtDireccion">Direccion:</label><br>
<input type="text" id="txtDireccion" name="direccion" ><br>
<label for="txtCorreo">Correo:</label><br>
<input type="text" id="txtCorreo" name="correo" ><br>
<label for="txtTelefono">Telefono</label><br>
<input type="number" id="txtTelefono" name="telefono" ><br><br>


<input type="submit" value="Registrar">
</form>
</fieldset>
</article>

<article>
<fieldset>
<legend>Listar Clientes</legend>
<p>Para listar Clientes presione el siguiente boton</p>

<form action="clientes" method="GET">

<input type="submit" value="Consultar">
</form>
</fieldset>
</article>

</section>

<footer>

<h6>Registro de Clientes</h6>
</footer>

</div>
</body>
</html>
     
          
    </body>
</html>
