package com.careerit.cbook.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.service.ContactService;
import com.careerit.cbook.service.ContactServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cbook")
public class ContactBookServlet extends HttpServlet{

		private ContactService contactService = new ContactServiceImpl();
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			    List<Contact> contacts = contactService.getAllContacts();
				req.setAttribute("contacts", contacts);
				RequestDispatcher rd = req.getRequestDispatcher("viewcontacts.jsp");
				rd.forward(req, resp);
		
		}
	
}
