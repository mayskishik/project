/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Scanner;

/**
 *
 * @author Raia
 */
@WebServlet(urlPatterns = {"/TomSL"})
public class TomSL extends HttpServlet {
    String Test;
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
         
        String ID = request.getParameter("ID");
        String Password = request.getParameter("Password");
        
        String IDTx = ":D",PasswordTx= ":D";
        Boolean flag = false;
             try {
                 // open new file
            File Usersfile = new File("C:/xampp/htdocs/network2/SNMP_Java/NET2ProjWEB/src/java/users.txt");
             
                //if file not exist ..
            if (!Usersfile.exists()) {
                response.getWriter().print("File does not exist.");   
                return;
            }
            
            Scanner scanner = new Scanner(Usersfile);
            while (scanner.hasNextLine()) { 
                String l = scanner.nextLine();
                String[] UserPass = l.split("-"); // split it by "-"
                  IDTx = UserPass[1];
                  PasswordTx = UserPass[2];
                System.out.print(UserPass[1]+"   "+ID+ "   pass"+UserPass[2]+"    "+Password);
                    if (UserPass[1].equals(ID) && UserPass[2].equals(Password)) {
                         Test = "From File accessed by Server--> User ID= "+IDTx + " Pass= "+PasswordTx+"\n";
                    flag = true;
                    break;
                }
            } // end of while loop
            scanner.close();
          
       if(flag == true) {  
            response.getWriter().print("Permit"); // response 
            
        } else {
            response.getWriter().print("Deny");
            

        }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
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
