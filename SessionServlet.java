package com.quinnox.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String user=request.getParameter("u");
		String pass=request.getParameter("p");
		
		if(user.equals("raj") && pass.equals("redhat"))
		{
			pw.println("Welcome "+user+ "<br><br>");
			pw.println("Login Success..!!");
			//RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
			//rd.forward(request, response);
			pw.print("Here is your password:"+pass);
			pw.print("<br><br>");
			HttpSession session=request.getSession();
			session.setAttribute("usname", user);
			session.setAttribute("uspass",pass);
			pw.println("session id is:"+session.getId()+"<br/>");
			pw.println("locale is:"+new Date(session.getLastAccessedTime())+"<br/>");
			
		}
		else
		{
			pw.println("<html><body text='red'><h3>Login Failed..!!</h3></body></html>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request,response);
		   // pw.close();
		}
   pw.print("<a href='SessionWelcome'>View details</a>");
   pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
