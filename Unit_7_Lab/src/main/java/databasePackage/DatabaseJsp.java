package databasePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseJsp {
	Connection con;

	public DatabaseJsp() throws ClassNotFoundException, SQLException {
		
		System.out.println("Starting");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String database = "NSC_CSIT_Assignment";
		int port = 1433;
		String server = "//DESKTOP-6C86VFI";
		String connectionString = "jdbc:sqlserver:"+server+":"+port+";databaseName="+ database+";integratedSecurity=true;"+
			     "encrypt=true;trustServerCertificate=true";
		
		
		con = DriverManager.getConnection(connectionString);
		
		System.out.println("Connection Activated");	
		
	}
	
	public Connection getConnection() {
		return con;
	}
}
