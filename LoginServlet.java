 package com.quinnox.basics.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.quinnox.basics.DAO.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("u");
		String password=request.getParameter("p");
		
		Base64.Encoder encoder=Base64.getEncoder();
		String normalString=password;
		String encodedString=encoder.encodeToString(normalString.getBytes(StandardCharsets.UTF_8));
		String password1=encodedString;
		if(LoginDao.validate(email,password1)){
			HttpSession session=request.getSession(true);
			session.setAttribute("user",email);
			
			RequestDispatcher rd=request.getRequestDispatcher("ViewCustomers.jsp");
		 	rd.forward(request, response);
		    out.print("Login Successful");  
		}
		else
		{
			out.print("Sorry username or password error");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request,response);

		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
