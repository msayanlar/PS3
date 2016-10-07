package ps3;


import java.util.Date; 

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date  dateCreated;
	
	public Account(){
	
		id=0;
		balance=0.0;
		annualInterestRate=0.0;
		dateCreated=new Date();
	}
		
	public Account(int newId, double InitialBalance){
		id=newId;
		balance=InitialBalance;
		dateCreated=new Date();
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int newId) {
		id = newId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double InitialBalance) {
		this.balance = InitialBalance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate(double d) {
		
		return annualInterestRate/12;
	}
	
	public double withdraw(double Amount){
		return balance=balance - Amount;
		
	}
	
	public double deposit(double Amount){
		
		return balance= balance + Amount;
		
	}
	
	
}
