<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title> Formulario Principal</title>
    </head>
    <body>
        <h1>Introdusca los datos</h1>
        
        <form:form method="post"   commandName="vlistaroles">
           
            <p>
                <form:label path="usuario">Introdusca el Usuario</form:label>
                <form:input path="usuario" />
                <form:errors path="usuario" />
            </p>
            
            <p>
                <form:label path="contrasena">Introdusca la Contraseña</form:label>
                <form:input path="contrasena"  />
                <form:errors path="contrasena" />
            </p>
            
          
            <hr>
            <form:button >Aceptar</form:button> <a href="listaEstudiantes.htm"> Cancelar </a>
        </form:form>
        
    </body>
</html>