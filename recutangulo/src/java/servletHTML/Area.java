/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletHTML;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "circulo", urlPatterns = {"/circulo"})
public class Area extends HttpServlet {
    String diametrox;
    int radio;
    float area, perimetro;

    @Override
    public void doPost(HttpServletRequest pedir, HttpServletResponse respuesta)throws ServletException, IOException{
        diametrox = pedir.getParameter("diametro");
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        radio= Integer.parseInt(diametrox);
        area = (float) ((radio/2)*(radio/2)*3.1416) ;
        perimetro =(float) (2*(radio/2)*3.1416);
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Area del circulo</title>");            
            out.println("El area es" + area);            
            out.println("</head>");
            out.println("<body>");

            out.println("</body>");
            out.println("</html>");
        
    }}
   
