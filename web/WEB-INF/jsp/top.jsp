<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <script>
    function myFunc() {
        var selectBox = document.getElementById("idusu");
        var selectedValue = selectBox.options[selectBox.selectedIndex].value;
        
        alert(selectedValue);
        document.getElementById("fmiusuario").submit();
   }
    </script>
    <body>
        
        <table><tr><td> sfds</td> <td>${fmiusuario.getNombre()}&nbsp;${fmiusuario.getApellido1()}&nbsp;${fmiusuario.getApellido2()}</td> <td> 
            
            <form:form method="POST" id="fmiusuario" commandName="fmiusuario" >
                <form:select id="idusu" path="idusu"  onchange="myFunc()"> 
                     <c:forEach  var="dato2" items="${misusuarios}" >                      
                         <form:option value="${dato2.key}" label="${dato2.value}" />
                     </c:forEach>
                </form:select> 
             
           </form:form>
             
                </td></tr></table>
    </body>
</html>
