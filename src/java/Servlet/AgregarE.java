/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Bean.Empleado;
import Mantenimiento.CrudEmpleado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LonyStewart
 */
@WebServlet(name = "AgregarE", urlPatterns = {"/AgregarE"})
public class AgregarE extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
   String Cedula= request.getParameter("cedula");
   String Nombres=request.getParameter("nombres");
   String Apellidos=request.getParameter("apellidos");
   String Telefono=request.getParameter("telefono");
   int Hijos=Integer.valueOf(request.getParameter("hijos"));
   String Sexo=request.getParameter("sexo");
  
   String Estadocivil=request.getParameter("estadocivil");
   String Direccion=request.getParameter("direccion");
   String Cargo=request.getParameter("cargo");
   int Sueldo=Integer.valueOf(request.getParameter("sueldo"));
   String estado = "n/s";
   Empleado e = new Empleado(Cedula,Nombres,Apellidos,Telefono,Hijos,Sexo,Estadocivil,Direccion,Cargo,Sueldo,estado);
   CrudEmpleado ce = new CrudEmpleado();
   if(ce.GuardarEmpleado(e)==true){response.sendRedirect("AgregarEmpleados.jsp");};
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
