package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.User;

public class UserDAO
{
	public Connection connection;
	
	public UserDAO()
	{
		try
		{
			connection = DBConnection.getConnection();
			System.out.println("CONNECTION ESTABLISHED");
		}
		catch(Exception e)
		{
			System.out.println("ERROR");
			e.printStackTrace();
		}
	}
	
	public boolean addUser(User user)
	{
		try 
		{
			PreparedStatement pst = connection.prepareStatement("INSERT INTO USER VALUES(?,?,?,?,?);");
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getName());
			pst.setString(3, user.getMobile());
			pst.setString(4, user.getEmail());
			pst.setString(5, user.getPassword());
			int count = pst.executeUpdate();
				if(count > 0)
					return true;
				else
					return false;
		}	
		
		catch(Exception e)
		{
			System.out.println("ERROR ADDING USER");
			e.printStackTrace();
			return false;
		}
	}
}
