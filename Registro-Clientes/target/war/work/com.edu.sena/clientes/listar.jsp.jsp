

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de clientes</h1>

        <%
            List<Clientes> clientes = (List) request.getSession().getAttribute("listaClientes");
            int cont = 1;
            for (Clientes e : clientes) {

        %>

        <p><b>usuario Numero:<%=cont%> </b></p>
        
        <p>cedula:<%=e%> </p>

        <%cont=cont+1;%> 
        
        <% }%>
       
    </body>
</html>
