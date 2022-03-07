package com.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		String user = req.getParameter("userName");
		String pass = req.getParameter("userPassword");
		
		if(user.equals("muhib") && pass.equals("muhib")) {
			out.println("Login Success.....!");
		}
		else out.println("Login Failed....!");
		out.close();
	}
}
