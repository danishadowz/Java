<%-- 
    Document   : resultado
    Created on : Sep 15, 2023, 7:16:04 PM
    Author     : Danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado del Triángulo Equilátero</title>
</head>
<body>
    <h1>Resultado del Triángulo Equilátero</h1>
    <p>Área: <%= request.getAttribute("area") %></p>
    <p>Perímetro: <%= request.getAttribute("perimetro") %></p>
</body>
</html>
