package unit3;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Createtable {
	Connection con;
	Statement statement;

	public Createtable() throws ClassNotFoundException, SQLException {
		con = new Database().getConnection();
		statement = con.createStatement();
		String create = "\r\n" + "CREATE TABLE Stu(\r\n" + "	Firstname varchar(100),\r\n"
				+ "Lastname varchar(100), \r\n" + "ContactNumber varchar(100 \r\n)" + ")";

		statement.executeUpdate(create); // creates a table in db

		System.out.println("Table Created");

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		new Createtable();
	}

}
