package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
//		System.out.println("sq servlet");
		
//		int k = Integer.parseInt(req.getParameter("k"));
		
//		HttpSession session = req.getSession();
//		
//		int k = (int) session.getAttribute("k");
		
		int k = 0;
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		k=k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result of addition of the given two numbers is "+ k);
	}
}
