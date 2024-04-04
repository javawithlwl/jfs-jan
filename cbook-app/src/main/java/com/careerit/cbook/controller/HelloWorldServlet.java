package com.careerit.cbook.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet{

		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			StringBuilder sb = new StringBuilder();
			sb.append("<html>");
			sb.append("<head><title>Contact Book Application</title></head>");
			sb.append("<body>Welcome to Contact Book App</body>");
			sb.append("</html>");
			out.print(sb.toString());
		}
	
}
