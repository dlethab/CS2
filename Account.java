
import java.util.*;
public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	Account() {
		
	}
	
	Account(int objID, double objBalance, double objInterest) {
		id = objID;
		balance = objBalance;
		annualInterestRate = objInterest;
	}
	
	//this constructor is needed for the ATM problem which is extends Account
	Account(int objID, double objBalance) {
		id = objID;
		balance = objBalance;
	}
	
	//get methods (mutators and accessors to get the private values)
	//accessors
	public int getID() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterest() {
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
		dateCreated = new Date();
		return dateCreated;
	}
	
	//mutators
	public void setID(int newId) {
		id = newId; //changes the private value in Account class
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setInterestRate(double newInterest) {
		annualInterestRate = newInterest;
	}
	
	//balance changing methods
	public void withdraw(double amount) {
		balance-=amount;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public double getMonthlyInterest() {
		double afterInterest = balance * (1.0 + annualInterestRate/100);
		return afterInterest - balance;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	
	public static void main(String[] args) {
		
		Account a1 = new Account(1122, 20000, 4.5);
		a1.withdraw(2500);
		a1.deposit(3000);
		System.out.println("Final balance: " + a1.getBalance());
		System.out.println("Monthly interest: " + a1.getMonthlyInterest());
		System.out.println("Account created: " + a1.getDateCreated());
		
	}

}
