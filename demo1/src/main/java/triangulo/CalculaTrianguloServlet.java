package triangulo;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(name="CalculaTrianguloServlet", urlPatterns = {"/CalculaTrianguloServlet"})
public class CalculaTrianguloServlet extends HttpServlet{
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            double base = Double.parseDouble(request.getParameter("base"));
            double altura = Double.parseDouble(request.getParameter("altura"));

            Triangulo triangulo = new Triangulo(base, altura);
            double area = triangulo.calcularArea();
            double perimetro = triangulo.calcularPerimetro();
            String name = request.getParameter("name");
            request.setAttribute("area", area);
            request.setAttribute("perimetro", perimetro);

            String nombreUsuario = request.getParameter("nombre");
            HttpSession session = request.getSession();
            session.setAttribute("nombreUsuario", nombreUsuario);
            if (nombreUsuario == null) {
            nombreUsuario = request.getParameter("nombre");
            session.setAttribute("nombreUsuario", nombreUsuario); }

            Cookie areaCookie = new Cookie("area", String.valueOf(area));
            Cookie perimetroCookie = new Cookie("perimetro", String.valueOf(perimetro));
            Cookie altuCookie = new Cookie("altura", String.valueOf(altura));
            Cookie baseCookie = new Cookie("base", String.valueOf(base));
            response.addCookie(areaCookie);
            response.addCookie(perimetroCookie);
            response.addCookie(altuCookie);
            response.addCookie(baseCookie);

            request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }



}
