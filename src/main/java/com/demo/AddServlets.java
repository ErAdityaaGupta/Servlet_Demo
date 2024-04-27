package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlets extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor = 'cyan'>");
		out.println("Sum of both the numbers is:- "+k);
		out.print("</body></html>");
		
//		Cookie cookie = new Cookie("k", k+"");
//		res.addCookie(cookie);
		
//		HttpSession session = req.getSession();  (this is session management)
//		session.setAttribute("k", k);
		
//		res.sendRedirect("sq");
		
//		res.sendRedirect("sq?k="+k);  (this method is url writing)
		
//		res.getWriter().println("result is: "+ k); 
		
//		req.setAttribute("k", k); 

//		RequestDispatcher rd = req.getRequestDispatcher("sq");  (this is RequestDispacher)
//		rd.forward(req, res);
	} 
}
