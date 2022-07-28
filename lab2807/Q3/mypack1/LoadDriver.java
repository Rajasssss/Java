package mypack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {
	
	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = 	"jdbc:mysql://localhost:3306/project1";
		
		Connection con= null;
		
		// registerDriver( DriverManager )

		try {
			Class.forName(driver);
			System.out.println("Driver loaded successfully ...");
			
			con=DriverManager.getConnection(url, "root","password");
			System.out.println("Connection established with Database..");
			
			con.close();
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
			
			
		
		
		
		
	}

}
