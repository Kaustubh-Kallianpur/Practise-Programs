package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;
import model.User;

@WebServlet("/getUsers")
public class UserList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UserList() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserDAO userDAO = new UserDAO();
		List<User> list = new ArrayList<User>();
		list = userDAO.userList();
		System.out.println(list.get(0).getName());
		request.setAttribute("userList", list);
		RequestDispatcher rd = request.getRequestDispatcher("users.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
