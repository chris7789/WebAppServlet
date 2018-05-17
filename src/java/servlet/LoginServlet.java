/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.UsuarioBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.AutenticacionService;

/**
 *
 * @author generation
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {


 
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            
        
        String usuario, contraseña;
        
        usuario = request.getParameter("email");
        contraseña = request.getParameter("pass");
       
        AutenticacionService aut = new  AutenticacionService();
        
        boolean loginSuccess = aut.autenticacion(usuario, contraseña);
        if(loginSuccess){
            
            UsuarioBean us = aut.getUsuarioValido(usuario, contraseña);
            if(us!=null){
            
            request.setAttribute("us", us);
            RequestDispatcher dispatcher = request.getRequestDispatcher("exito.jsp");
            dispatcher.forward(request, response);
                
            }else{
                PrintWriter out = response.getWriter();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Usuario o contraseña invalido ... patrañoso...')");
                out.println("location='Login.jsp';");
                out.println("</script>");
            }
           
        }
        else{
             /*String hackea = request.getRemoteAddr();
            System.out.println(hackea);
            if (hackea.equals("192.168.66.49")){
                PrintWriter auch = response.getWriter();
                auch.print("ah pishi vato tracalas");
  
                //192.168.66.250:8080/MiPrimerJSP/Login.jsp
            }else{*/
            response.sendRedirect("Login.jsp");}
        
        
    }

 
}
