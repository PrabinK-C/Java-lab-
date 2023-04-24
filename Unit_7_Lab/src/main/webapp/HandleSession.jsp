<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session JSP</title>
</head>
<body>
	<%
	   // Start a new session or get an existing one
	   HttpSession sessions = request.getSession(true);
	   
	   // Set a session attribute
	   sessions.setAttribute("username", "prabinkc");
%>

<%
   // Get the session
   HttpSession sess = request.getSession(false);
   
   // Check if the session exists
   if(sess != null){
      // Retrieve a session attribute
      String name = (String) session.getAttribute("username");
      out.println("Welcome " + name + "!");
   }
   
   
%>

</body>
</html>