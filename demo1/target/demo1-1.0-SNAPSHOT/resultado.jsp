<%@ page import="triangulo.Triangulo" %><%--
  Created by IntelliJ IDEA.
  User: Danie
  Date: 10/3/2023
  Time: 9:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Resultado del Tríanguo Equialtero</title>
</head>
<body>
    <h1> Resultado del Calculo </h1>
    <p>Área: <%= request.getAttribute("area")%>  </p>
    <p>Perimetro: <%= request.getAttribute("perimetro") %> </p>


</body>
</html>
