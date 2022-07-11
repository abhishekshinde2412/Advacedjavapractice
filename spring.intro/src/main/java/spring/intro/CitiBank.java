package spring.intro;

import org.springframework.stereotype.Component;

@Component
public class CitiBank implements Bank {
	
	public void withdraw(int atmid,int acno, double amount) {
		System.out.println("Customer of CitiBank wants to withdraw money..");
	}
	

}
