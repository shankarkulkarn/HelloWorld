package com.cg.exceptiondemo;

public class Account {

	private int accountId;
	private String accountName;
	private double balance;
	public Account(int accountId,String accountName,double balance)
	{
		this.accountId = accountId;
		this.accountName = accountName;
		this.balance = balance;
	}
	public Account()
	{
	  this(0,null,0);
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double  deposit(int amount)
	{
		  // fill the code ;
		  return 0;
	}
	
	public double  withdraw(int amount) throws BalanceException
	{
		if( amount <=0 )
		{
			throw new IllegalArgumentException("Amount should be positive ");
		}
		
		if( amount > this.getBalance() )
		{
			throw new  BalanceException("Insufficient Balance ");
		}
		
			this.balance = this.balance - amount;
			// setBalance( getBalance() - amount );
		
		
		return this.getBalance();
	}
	
	
}
