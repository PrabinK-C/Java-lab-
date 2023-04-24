package unit3;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transcation {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        try {
            // Connect to database
        	Connection con = new Database().getConnection();
            // Turn off auto-commit mode
            con.setAutoCommit(false);
            
            // Create a Statement object
            Statement stmt = con.createStatement();
            
            // Execute the first SQL statement
            String sql1 = "UPDATE Student SET fees = fees - 100 WHERE Firstname = 'Jane'";
            stmt.executeUpdate(sql1);
            
            // Execute the second SQL statement
            String sql2 = "UPDATE Student SET fees = fees + 100 WHERE Firstname = 'Bob'";
            stmt.executeUpdate(sql2);
            
            // Commit the transaction
            con.commit();
            
            // Close the Statement and Connection objects
            stmt.close();
            con.close();
            
            System.out.println("Transaction completed successfully.");
            
        } catch (SQLException e) {            
            e.printStackTrace();
        }
    }
}
