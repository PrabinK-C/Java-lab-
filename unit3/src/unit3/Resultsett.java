package unit3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultsett {
	Connection con;
	public Resultsett() throws ClassNotFoundException, SQLException {
		
		con = new Database().getConnection();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = stmt.executeQuery("SELECT * FROM Student");

        // Print the initial contents of the ResultSet

        System.out.println("Initial contents of ResultSet:");
        printResultSet(rs);


        rs.absolute(1);
        
        rs.updateString("Lastname","Doe" );
        rs.updateRow();

        System.out.println("Contents of updating");
        printResultSet(rs);
        

        rs.close();
        stmt.close();
        con.close();
			
		
	}
	private static void printResultSet(ResultSet rs) throws SQLException {
	    rs.beforeFirst();
	    while (rs.next()) {
	        System.out.println(rs.getString("Firstname") + "\t" + rs.getString("Lastname"));
	    }
	    System.out.println();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		new Resultsett();
	}

}
