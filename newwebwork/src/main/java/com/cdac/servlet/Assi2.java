package com.cdac.servlet;

import java.io.IOException;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Assi2")
public class Assi2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String input = request.getParameter("dob");
		int age =0;
		
		LocalDate date = LocalDate.parse(input);
//		System.out.println(date);
		
		date.getYear();
		
		LocalDate date2 = java.time.LocalDate.now();
		
		age= date2.getYear() - date.getYear();
		
		Period p = Period.between(date, date2);

	}

}
