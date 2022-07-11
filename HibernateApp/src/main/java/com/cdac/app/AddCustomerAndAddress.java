package com.cdac.app;

import com.cdac.dao.CustomerAddressDao;
import com.cdac.entity.Address;
import com.cdac.entity.Customer;

import antlr.collections.List;

public class AddCustomerAndAddress {
	
	public static void main(String[] args) {
		
		CustomerAddressDao dao = new CustomerAddressDao();
		

		/*Customer c = new Customer();
		c.setName("Abhishek");
		c.setEmail("abhishek@gmail");
		dao.add(c);
		
		Address a = new Address();
		a.setPincode(422008);
		a.setCity("Nashik");
		a.setState("Maharashtra");
		dao.add(a);*/
		
		/*Customer c = dao.fetchcustomer(1);
		Address a = dao.fetchAddress(1);
		
		c.setAddress(a);
		dao.update(c);*/
		
	   /* Customer c = new Customer();
	    c.setName("Abhijeet");
	    c.setEmail("abhijeet@outlook");
	    
	    Address a = new Address();
	    a.setPincode(422001);
	    a.setCity("mumbai");
		a.setState("Maharashtra");
		
		c.setAddress(a);
		dao.add(c);*/
		
		
		/*java.util.List<Customer> list = dao.fetchCustomersByEmail("gmail");	
		
		for(Customer c : list)
			System.out.println(c.getId() + " " + c.getName() + " " + c.getEmail());
		*/
		
		java.util.List<Customer> list = dao.fetchCustomersByCity("nashik");	
		for(Customer c : list)
			System.out.println(c.getId() + " " + c.getName() + " " + c.getEmail());
	}

}
