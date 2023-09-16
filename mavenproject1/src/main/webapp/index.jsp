<%-- 
    Document   : index
    Created on : Sep 15, 2023, 7:11:03 PM
    Author     : Danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Triángulo Equilátero</title>
</head>
<body>
    <h1>Calculadora de Triángulo Equilátero</h1>
    <form action="CalculaTrianguloServlet" method="post">
        Base: <input type="text" name="base"><br>
        Altura: <input type="text" name="altura"><br>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>

