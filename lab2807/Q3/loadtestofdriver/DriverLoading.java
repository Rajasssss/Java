package loadtestofdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DriverLoading {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = 	"jdbc:mysql://localhost:3306/project1";
		
		String create_query ="CREATE TABLE `acp_2022` (`sid` INT NOT NULL,`sname` VARCHAR(45) NOT NULL,`dept` VARCHAR(45) NOT NULL,`marks` INT NULL,PRIMARY KEY (`sid`))";
		
		Connection con= null;
		Statement stmt = null;
		
		// registerDriver( DriverManager )

		try {
			Class.forName(driver);
			System.out.println("Driver loaded successfully ...");
			
			con=DriverManager.getConnection(url, "root","password");
			System.out.println("Connection established with Database..!");
			
			stmt = con.createStatement();
			System.out.println("Platform created successfully ..!");
			
			stmt.execute(create_query);
			System.out.println("Query executed succesfully.. !");
			
			
			
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
	}

}
