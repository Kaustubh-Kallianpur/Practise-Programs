package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public boolean login(String username, String password)
	{
		try
		{
			PreparedStatement pst = connection.prepareStatement("SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?");
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
				boolean value = rs.next();
			if(value)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public List<User> userList()
	{
		System.out.println("List User Called");
		try 
		{
			List<User> list = new ArrayList<User>();
			PreparedStatement pst = connection.prepareStatement("SELECT * FROM USER");
			ResultSet rs = pst.executeQuery();
			if(rs != null)
			{
				while(rs.next())
				{
					User user = new User();
					System.out.println(rs.getString(1));
					user.setUsername(rs.getString(1));
					user.setName(rs.getString(2));
					user.setMobile(rs.getString(3));
					user.setEmail(rs.getString(4));
					user.setPassword(rs.getString(5));
					list.add(user);
				}
			}
			return list;
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
			return null;
		}
	}
}