package filtro;

import java.io.IOException;
import jakarta.servlet.*;
import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter(filterName="number", urlPatterns={"/*do", "/java/triangulo"})

public class filter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException{

        double base =  Double.parseDouble(request.getParameter("base"));
        double altura = Double.parseDouble(request.getParameter("altura"));

        if(base > 0 && altura > 0 ){
            chain.doFilter(request, response);
        } else {
            response.getWriter().write("La base y la altura deben ser mayores a 0");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException{

    }

    @Override
    public void destroy(){

    }
}
