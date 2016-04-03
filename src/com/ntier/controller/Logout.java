package com.ntier.controller;

import com.ntier.fff.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	  /**
     * @see HttpServlet#HttpServlet()
     */
	
    public Logout() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg = " ";		
		String link = "";
		HttpSession session = request.getSession();
		User user = (com.ntier.fff.User)session.getAttribute("user");
		if (user != null) { 
			msg = "Thank you, " + user.getFname() + ", you have successfully logged out";
			link = "index.jsp";
			session.invalidate();
			}
		request.setAttribute("msg", msg);	
		RequestDispatcher rd = request.getRequestDispatcher(link);
		rd.forward(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
