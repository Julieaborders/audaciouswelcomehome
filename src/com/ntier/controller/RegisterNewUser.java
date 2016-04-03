package com.ntier.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ntier.dao.UserDAO;
import com.ntier.fff.User;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/register")
public class RegisterNewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterNewUser() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}
	public void init() {
       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");
		String link = "FindsVendorNewReg.jsp";
		String msg = " ";
		if (!password.equals(cpassword)){
			msg = "Passwords don't match, please try again.";
			} else {
		User user = new User();
		user.setEmail(email);
		UserDAO udao = new UserDAO();
		Collection<User> myCollection = udao.find(user);
		if (myCollection.size() > 0) {
				msg = "Email/Username already in use, please log-in below.";
			} else {
				user.setFname(fname);
				user.setLname(lname);
				user.setPassword(password);
				udao.add(user);
				msg = "You have successfully registered!";
				link= "ReviseaVenues.jsp";	
			}
		}
		request.setAttribute("msg", msg);	
		RequestDispatcher rd = request.getRequestDispatcher(link);
		rd.forward(request,response);
		}
	}
