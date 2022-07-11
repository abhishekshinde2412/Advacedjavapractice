package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Assi12")
public class Assi12 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no1 = Integer.parseInt(request.getParameter("num1")) ;
		int no2 = Integer.parseInt(request.getParameter("num2")) ;
		String str= request.getParameter("b1");
		
		int result =0;
		
		if(str.equals("Add"))
			result=no1+no2;
		
		else if(str.equals("sub"))
			result=no1-no2;
		
		else if(str.equals("mul"))
			result=no1*no2;
		
		else if(str.equals("div"))
			result=no1/no2;
		
		
		
		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();
		
		out.write("<html><body>");
		
		out.write("<h1> result is " +result + "</h1>");
		
		out.write("</body></html>");
			
	}

}
