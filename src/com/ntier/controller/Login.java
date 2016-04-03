package com.ntier.controller;

import com.ntier.dao.UserDAO;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ntier.fff.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String link = "";
		String msg = "";

		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("user");
		if (user != null && user.getId() > 0) {
			msg = "You're already logged in";
			link = "ReviseaVenues.jsp";
		} else {
			UserDAO udao = new UserDAO();
			user = new User();
			user.setEmail(email);
			user.setPassword(password);
			Collection<User> myCollection = udao.find(user);
			if (myCollection.size() > 0) {
				for (Iterator<User> iterator = myCollection.iterator(); iterator.hasNext();) {
					user = (User) iterator.next();
				}
				session = request.getSession();
				session.setAttribute("user", user);
				link = "ReviseaVenues.jsp";
				msg = "Welcome back, " + user.getFname()+ "!";
			} else {
				link = "FindsVendorNewReg.jsp";
				msg = "Login failed. Please try again.";
			}
		}
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher(link);
		rd.forward(request, response);
	}
}
