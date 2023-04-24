package unit3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	Connection con;
	Statement statement;
	ResultSet resultset;

	public Insert() throws ClassNotFoundException, SQLException {
		con = new Database().getConnection();
		statement = con.createStatement();

		String insert = "INSERT INTO STUDENT VALUES ('asbin', 'chad', '9846655244','259')";

		statement.executeUpdate(insert);
		System.out.println("Data inserted");

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new Insert();

	}

}
