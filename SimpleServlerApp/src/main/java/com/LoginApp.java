package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter pw=response.getWriter();
	String username =request.getParameter("uname");//recieve the uname
	String password=request.getParameter("Pwd");   //recieve the password
	if(username.equals("Prakash")&& password.equals("123"))
	{	
	pw.println("Succesfully login "+username);
	}
	else {
		pw.println("Invalid username or password ");
		pw.println("Try Again");
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
