<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title> Calculadora para Triangulo Equilatero</title>
    </head>
    <body>

    <% String nombreUsuario = (String) session.getAttribute("nombreUsuario"); %>
    <p>Bienvenido, <%= nombreUsuario %>!</p>


    <%
        Cookie[] cookies = request.getCookies();
        String baseCookieValue = null;
        String alturaCookieValue = null;
        String areaCookieValue = null;
        String perimetroCookieValue = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("base")) {
                    baseCookieValue = cookie.getValue();
                } else if (cookie.getName().equals("altura")) {
                    alturaCookieValue = cookie.getValue();
                } else if (cookie.getName().equals("area")) {
                    areaCookieValue = cookie.getValue();
                } else if (cookie.getName().equals("perimetro")) {
                    perimetroCookieValue = cookie.getValue();
                }
            }
        }
    %>

    <%
        if (baseCookieValue != null && alturaCookieValue != null && areaCookieValue != null && perimetroCookieValue != null)
    %>
    <h2>Último Triángulo Calculado:</h2>
    <p>Base: <%= baseCookieValue %></p>
    <p>Altura: <%= alturaCookieValue %></p>
    <p>Área: <%= areaCookieValue %></p>
    <p>Perímetro: <%= perimetroCookieValue %></p>
    <h1>Calculadora Triangulo Equilatero </h1>

        <form action ="CalculaTrianguloServlet" method="post">
            Nombre: <input type="text" name="nombre"><br>
            Base: <input type="text" name="base"><br>
            Altura: <input type="text" name="altura"><br>
            <input type="submit" value="Calcular">
        </form>

    </body>
</html>