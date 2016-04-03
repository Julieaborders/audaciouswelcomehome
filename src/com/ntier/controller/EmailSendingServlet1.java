package com.ntier.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ntier.dao.UserDAO;
import com.ntier.fff.EmailUtility;
import com.ntier.fff.User;

/**
 * A servlet that takes message details from user and send it as a new e-mail
 * through an SMTP server.
 *
 * @author www.codejava.net
 *
 */
@WebServlet("/EmailSendingServlet1")
public class EmailSendingServlet1 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String host;
	private String port;
	private String adminUser;
	private String pass;

	public void init() {
		// reads SMTP server setting from web.xml file
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		adminUser = context.getInitParameter("user");
		pass = context.getInitParameter("pass");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// reads form fields
		String email = request.getParameter("email");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String phone = request.getParameter("phone");

		User user = new User();
		user.setEmail(email);
		UserDAO udao = new UserDAO();
		Collection<User> myCollection = udao.find(user);
		if (myCollection.size() == 0) {
			user.setFname(fname);
			user.setLname(lname);
			user.setPhone(phone);
			udao.add(user);
		}

		String subject = "Here's what we heard from you, " + fname + ". Thanks for your Feedback!";
		String comment = request.getParameter("comment");

		String msg2 = "";
		if (comment != null && comment.length() > 0) {
			try {
				EmailUtility.sendEmail(host, port, adminUser, pass, email, subject, comment);
				msg2 = "We sent a feedback confirmation to your email, " + fname + ".";
			} catch (Exception ex) {
				ex.printStackTrace();
				msg2 = "Apologies, there was an error; we may not have gotten your feedback. " + ex.getMessage();
			} finally {
				request.setAttribute("Message", msg2);
			}
		} // end if

		getServletContext().getRequestDispatcher("/Resources.jsp").forward(request, response);

	}
}