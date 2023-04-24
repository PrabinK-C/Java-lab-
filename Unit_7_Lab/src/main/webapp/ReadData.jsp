<%@page import="java.sql.*"%>
<%@page import="databasePackage.DatabaseJsp"%>

<html>
<head>
  <title>Display Data</title>
</head>
<body>
  <h1>Student Data</h1>
  <table border="1">
    <tr>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Contact</th>
      
    </tr>
    <% 
      try {
    	  
 		Connection con = new DatabaseJsp().getConnection();
  		
  		System.out.println("Connection Activated");	

        
        // Create a statement object
        Statement stmt = con.createStatement();
        
        // Execute the query and get the result set
        ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
        
        // Iterate over the result set and print each row in a table row
        while (rs.next()) {
          out.print("<tr>");
          out.print("<td>" + rs.getString("Firstname") + "</td>");
          out.print("<td>" + rs.getString("Lastname") + "</td>");
          out.print("<td>" + rs.getString("ContactNumber") + "</td>");
      
          out.print("</tr>");
        }
        
        // Close the database connection
        con.close();
      } catch (Exception e) {
        out.print("Error: " + e.getMessage());
      }
    %>
  </table>
</body>
</html>
