
import java.util.*;

public class Account {

	private int id;
	private double balance;
	private double annualIntrestRate;
	private Date dateCreated;
	
	public Account()
	{
		 id = 0;
		 balance = 0;
		 annualIntrestRate = 0.0;
		 dateCreated = new Date();
	}
	public Account(int newId, double newBalance)
	{
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}
	
		
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		this.id = newId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	public double getAnnualIntrestRate() {
		return annualIntrestRate;
	}
	public void setAnnualIntrestRate(double newAnnualIntrestRate) {
		this.annualIntrestRate = newAnnualIntrestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public double getMonthlyInterestRate()
	{
		 
		return(annualIntrestRate / 12);
		
	}
	public double getMonthlyIntrest()
	{
		
		return balance * (getMonthlyInterestRate() / 100);
		
	}

	public void withdraw(double withdraw)
	{
		
		 balance -= withdraw;
	}
	public void deposit(double deposit)
	{ 
		 balance += deposit;
	}
	
}
