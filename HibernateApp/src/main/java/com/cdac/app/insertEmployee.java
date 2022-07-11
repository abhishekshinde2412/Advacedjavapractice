package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.dao.EmployeeDao;
import com.cdac.entity.Employee;

public class insertEmployee {
	
	public static void main(String [] args) {
		
		// insert in table
	/*	Employee emp = new Employee();
		emp.setEmpno(103);
		emp.setName("Aditya");
		emp.setSalary(6000);
		emp.setDateOfJoining(LocalDate.of(2020, 01, 02));
		
		EmployeeDao dao = new EmployeeDao();
		
		dao.add(emp);*/
		
		//select query where empno=101
   	/*	EmployeeDao dao = new EmployeeDao();
		Employee emp = dao.fetch(101);
		
		System.out.println(emp.getName()+" "+emp.getSalary());
	*/
		EmployeeDao dao = new EmployeeDao();
		List<Employee> list2 = dao.fetchAllBySalary(5000);
		for(Employee emp : list2)
			System.out.println(emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
		
	
		
		
	}
	
	
	// day 1 code simple code in 1 file now we divide in 2 files employeeDao.java
	/*public static void main (String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Employee emp = new Employee();
		emp.setEmpno(101);
		emp.setName("Abhishek");
		emp.setSalary(10000);
		emp.setDateOfJoining(LocalDate.of(2020, 01, 02));
		em.persist(emp);
		
		tx.commit();
		
		emf.close();
		
	}*/

}
