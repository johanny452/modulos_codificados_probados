/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.edu.sena.registro.clientes.servlets;

import com.edu.sena.registro.clientes.logica.Clientes;
import com.edu.sena.registro.clientes.logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author EQUIPO
 */
@WebServlet(name = "SvClientes", urlPatterns = {"/SvClientes"})
public class SvClientes extends HttpServlet {
    
    Controladora controladora = new Controladora();
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       List<Clientes>clientes = new ArrayList<>();
       
       
       clientes = controladora.listarClientes();
       
        HttpSession sesion=request.getSession();
        sesion.setAttribute("listaClientes", clientes);
        
        response.sendRedirect("listar.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        
        int cedula= Integer.parseInt(request.getParameter("cedula"));
        String nombres= request.getParameter("nombres");
        String apellidos=request.getParameter("apellidos");
        String direccion=request.getParameter("direccion");
        String correo=request.getParameter("correo");
        int telefono=Integer.parseInt(request.getParameter("telefono"));
         
        Clientes e = new Clientes ();
        
        e.setCedula(cedula);
        e.setNombres(nombres);
        e.setApellidos(apellidos);
        e.setDireccion(direccion);
        e.setCorreo(correo);
        e.setTelefono(telefono);
        
        
        controladora.registrarClientes(e);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
