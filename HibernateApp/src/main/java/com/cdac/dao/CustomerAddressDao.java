package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.entity.Address;
import com.cdac.entity.Customer;
import com.mysql.cj.Query;

public class CustomerAddressDao {
	
	public void add(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(cust); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	
	public void add(Address addr) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(addr); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	
	public Customer fetchcustomer(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Customer emp = em.find(Customer.class, id);
		
		emf.close();
		return emp;

	}
	
	public Address fetchAddress(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		//find method generates select query where pk = ?
		Address addr = em.find(Address.class, id);
		
		emf.close();

		return addr;	
	}
	
	public void update(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.merge(cust);
		
		tx.commit();
		emf.close();
	}
	
	public List<Customer> fetchCustomersByEmail(String domain) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		javax.persistence.Query q = em.createQuery("select c from Customer c where c.email like :em");
		q.setParameter("em", "%" + domain + "%");
		List<Customer> list = q.getResultList();
		
		emf.close();

		return list;
	}

	public List<Customer> fetchCustomersByCity(String city) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		javax.persistence.Query q = em.createQuery("select c from Customer c join c.address a where a.city = :ct");
		q.setParameter("ct", city);
		List<Customer> list = q.getResultList();
		
		emf.close();

		return list;
	}

}
