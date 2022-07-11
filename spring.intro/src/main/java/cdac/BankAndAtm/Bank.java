package cdac.BankAndAtm;

public interface Bank {
	
	public boolean isAccountPresent(int acno);
	public void withdraw(int atmid,int acno, double amount);

}
