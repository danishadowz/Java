/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package triangulo;

import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "CalculaTrianguloServlet", urlPatterns = {"/CalculaTrianguloServlet"})
public class CalculaTrianguloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double base = Double.parseDouble(request.getParameter("base"));
        double altura = Double.parseDouble(request.getParameter("altura"));
        
        Triangulo triangulo = new Triangulo();
        double area = triangulo.calcularArea(base, altura);
        double perimetro = triangulo.calcularPerimetro(base);
        
        request.setAttribute("area", area);
        request.setAttribute("perimetro", perimetro);
        
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}

