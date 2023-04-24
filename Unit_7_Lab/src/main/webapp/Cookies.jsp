 page import="jakarta.servlet.http.Cookie" 
 <%@ page import="jakarta.servlet.http.HttpSession" %>
<%
  // create a new cookie
  Cookie myCookie = new Cookie("Name", "Prabin k.c");

  // set the cookie's maximum age (in seconds)
  myCookie.setMaxAge(3600); // expires in 1 hour

  // add the cookie to the response
  response.addCookie(myCookie);
%>

<html>
<head><title>Cookie Example</title></head>
<body>
  <h1>Cookie Example</h1>
  <p>A cookie has been saved with the name 'Name' and value 'Prabin kc'.</p>
</body>
</html>
