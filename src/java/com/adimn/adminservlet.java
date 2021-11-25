/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adimn;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.eclipse.jdt.internal.compiler.parser.Parser.name;

/**
 *
 * @author acer
 */
public class adminservlet extends HttpServlet {

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
        String tname = request.getParameter("trainname");
        String tnum = request.getParameter("trainnumber");
        String tfrom = request.getParameter("trainfrom");
        String tto = request.getParameter("trainto");
        String tseat = request.getParameter("trainseat");

        System.out.println(tname);
        System.out.println(tnum);
        System.out.println(tfrom);
        System.out.println(tto);
        System.out.println(tseat);

         Connection con;
        Statement stm;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/nectar","root","");
            stm = (Statement) con.createStatement();
            String sql="insert into  traindetail(tname,tnum,tfrom,tto,seats) values('"+tname+"','"+tnum+"','"+tfrom+"','"+tto+"','"+tseat+"')";
           int i= stm.executeUpdate(sql);
           if(i==1)
           {
               System.out.println("data inserted");
               response.sendRedirect("login.jsp");
           }
           
           else
           {
               
               System.out.println("not inserted");
           }
        } catch (Exception ee) {
            
            System.out.println(ee);
        }
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
