package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Assi11")
public class Assi11 extends HttpServlet {
	
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int no1 = Integer.parseInt(request.getParameter("num1")) ;
int no2 = Integer.parseInt(request.getParameter("num2")) ;


int add = no1 + no2 ;
		
		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();
		

		out.write("<html><body>");
		
		out.write("<h1> Addition of no is " +add + "</h1>");
		
		out.write("</body></html>");
}
}