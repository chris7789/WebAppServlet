<%-- 
    Document   : exito
    Created on : May 17, 2018, 11:22:31 AM
    Author     : generation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
            <h1>Ingresado con éxito C: </h1>
        <!-- muestra el usuario que ingresó-->
        <%-- UsuarioBean us = (UsuarioBean)request.getAttribute("us"); --%>
        <jsp:useBean id="us" class="beans.UsuarioBean" scope="request">
            </jsp:useBean>
        <h2>El usuario es: </h2>
        <jsp:getProperty name="us" property="usuario"></jsp:getProperty>
        <h1>${us.usuario}</h1>
        <%--= us.getUsuario() --%>
        
        
        
    </body>
</html>
