package com.careerit.cbook.controller;

import java.io.IOException;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.service.ContactService;
import com.careerit.cbook.service.ContactServiceImpl;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addcontact")
public class AddContactServlet extends HttpServlet {
	
		ContactService contactService = new ContactServiceImpl();
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String mobile = req.getParameter("mobile");
			
			Contact contact = new Contact();
			contact.setName(name);
			contact.setEmail(email);
			contact.setMobile(mobile);
			long id = contactService.addContact(contact);
			resp.sendRedirect("success.jsp?cid="+id);
			
			
					
		}

}
