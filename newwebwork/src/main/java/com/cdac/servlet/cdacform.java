package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cdacform")
public class cdacform extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		
		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();
		

		out.write("<html><body>");
		out.write("<h1>hello 123 " +name + "</h1>");
		out.write("<h2>todays date is " +LocalDate.now()+"</h2>");
		out.write("</body></html>");
		
	}

	

}
