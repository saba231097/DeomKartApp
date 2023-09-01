package com.main.demokartapp.jakarta.hello;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		if(username.equals("saba1001")) {
			if(password.equals("C0nfirms@123")) {
				resp.sendRedirect("profilehome.html");
			}
			else {
				resp.getWriter().print("<h1>OOPS! you have entered wrong password</h1>");
			}
		}else {
			resp.getWriter().print("<h1>OOPS! you have entered wrong userName</h1>");
		}
	}

}
