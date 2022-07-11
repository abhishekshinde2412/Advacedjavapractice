package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import com.cdac.dao.PersonPassportDao;
import com.cdac.entity.Passport;
import com.cdac.entity.Person;

public class PersonPassportExample {

	public static void main(String[] args) {
		PersonPassportDao dao = new PersonPassportDao();
		
		/*Person p = new Person();
		p.setName ("Abhijeet");
		p.setEmail("abhijeet@gmail.com");
		p.setDateofbirth(LocalDate.of(1997,05,8));
		
		Passport ps = new Passport();
		ps.setIssueDate(LocalDate.of(2019, 8, 20));
		ps.setExpiryDate(LocalDate.of(2029, 8, 20));
		ps.setEssuedBy("india");
		
		p.setPassport(ps);
		ps.setPerson(p);
		
		dao.add(p);*/
		
		/*Person p = dao.fetchPersonBypasssportNo(3);
		System.out.println(p.getName() + " " + p.getEmail());
		*/
		
		List<Person> list = dao.fetchPersonByPassportExpiryYear(2029);
		
		for(Person p : list)
			System.out.println(p.getName() + " " + p.getEmail());
	}
}
;