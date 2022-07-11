package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cdac.BankAndAtm.Atm1;
import spring.intro.Atm;
import spring.intro.Calculator;
import spring.intro.CurrencyConverter;
import spring.intro.HdfcAtm;
import spring.intro.HelloWorld;
import spring.intro.LoginService;
import spring.intro.TextEditor;

public class App {
	
	public static void main(String[] args) {
		//Loading Spring/IOC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		//Accessing a particular bean
		HelloWorld hw = (HelloWorld) ctx.getBean("hello");
		System.out.println(hw.sayHello("Abhishek"));
		
		Calculator cal = (Calculator) ctx.getBean("calci");
		System.out.println(cal.add(20, 15));
		System.out.println(cal.sub(20, 15));
		
		CurrencyConverter currconv = (CurrencyConverter) ctx.getBean("currencyConv");
		System.out.println(currconv.convert("USD", "INR", 100));
		
		LoginService ls = (LoginService) ctx.getBean("login");
		System.out.println(ls.isValidUser("abhishek", "123"));

		TextEditor te = (TextEditor) ctx.getBean("txtEdtr");
		te.load("abc.txt");
		
		Atm atm = (Atm) ctx.getBean("hdfcAtm");
		atm.withdraw(10101010, 5000);
		
		System.out.println(".");
		
		Atm1 atm1 =(Atm1) ctx.getBean("hdfcAtm-v2");
		atm1.withdraw(20202020, 5000);
}}
