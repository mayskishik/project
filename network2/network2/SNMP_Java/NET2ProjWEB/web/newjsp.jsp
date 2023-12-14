
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
   // Retrieve the submitted name and password from the request
   String name = request.getParameter("Username");
   String password = request.getParameter("Password");
   // Check if the name and password are correct
   if ("raia".equals(name) && "120".equals(password)) {
            response.getWriter().print("Permit"); // response 

   } 
   else if("asmaa".equals(name) && "130".equals(password)) {
                      response.getWriter().print("Permit"); // response 
      
   }
   else{
    response.getWriter().write("Deny");
    }
   


%>