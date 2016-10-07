package ps3Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ps3.Account;


public class CheckingAccountTest {

	
	private Account TesterAccount=new Account();
	
	@Before
	public void setUp() throws Exception {
		TesterAccount.setId(1122);
		TesterAccount.setBalance(20000);
		TesterAccount.setAnnualInterestRate(4.5);
	}
	
	
	@Test
	public void WithdrawlTest(){
		Account balance = new Account(1122, 20000);
				assertEquals(balance.withdraw(2500),17500,.01);
		
		
	}
	
	
	@Test
	public void DepositTest(){
		Account balance = new Account(1122, 20000);
				assertEquals(balance.deposit(3000),23000,.01);
		
		
	}
	
	
	

	@Test
	public void Account(){
		Account balance  = new Account(1122, 20000);
		balance.setAnnualInterestRate(4.5);
		assertEquals(balance.withdraw(2500), 17500,.01);
		assertEquals(balance.deposit(3000), 20500,.01);
		assertEquals(.375,balance.getMonthlyInterestRate(0),.01);
		System.out.println(balance.getBalance());
		System.out.println(balance.getMonthlyInterestRate(4.5) );
		System.out.println(balance.getDateCreated());
		}

	
	
	@Test
	public void InsufficientFunds(){
		
		Account balance = new Account(1122,2000);
		assertEquals(balance.withdraw(40000),-38000,.01);
		
		
	}
	
	}

 
	
	
	
	

