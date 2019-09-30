<%-- 
    Document   : designacionmateria
    Created on : Sep 12, 2019, 11:16:38 AM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>HOLA DESIGNACION MATERIA!</h1>
        <p>CI:${usuario.getCedula()}
            <br>
            Nombre Completo:${usuario.getNombre()}&nbsp;${usuario.getApellido1()}&nbsp;${usuario.getApellido2()}
            <br>
            Genero:${usuario.getSexo()}
            <br>
            Fecha de Nacimiento:${usuario.getF_nac()}
            <br>
            Telefono:${usuario.getTelefono()}
            <br>
            Direccion:${usuario.getDireccion()}
            <br>
            Foto:${usuario.getFoto()}
            <br>
            Activo:${usuario.getActivo()}
            <br>
        </p>
    </body>
</html>
