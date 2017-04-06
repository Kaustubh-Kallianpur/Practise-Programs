package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection 	
{
	
	public static Connection connection;
	
	public static Connection getConnection() throws Exception
	{
		Class.forName("org.h2.Driver");
		connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Practise", "Kaustubh", "");
		return connection;
	}
	
/*	public static void main(String[] args) throws Exception
	{
		connection = DBConnection.getConnection();
		if(connection==null)
			System.out.println("Connection Failure");
		else
			System.out.println("Connection Established");
	}
*/
}
