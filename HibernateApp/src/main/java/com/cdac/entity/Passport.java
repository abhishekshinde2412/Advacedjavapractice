package com.cdac.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_passsport")
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passportno;
	
	private LocalDate issueDate;
	private LocalDate expiryDate;
	private String essuedBy;
	
	@OneToOne
	@JoinColumn(name = "pers_id")
	private Person person;

	public int getPassportno() {
		return passportno;
	}

	public void setPassportno(int passportno) {
		this.passportno = passportno;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getEssuedBy() {
		return essuedBy;
	}

	public void setEssuedBy(String essuedBy) {
		this.essuedBy = essuedBy;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
}
