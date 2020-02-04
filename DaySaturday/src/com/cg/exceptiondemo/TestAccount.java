package com.cg.exceptiondemo;

public class TestAccount {

	public static void main(String[] args)   {
		
		
		Account  account  = new Account(1001,"Michael",9000);
		
		try
		{
		double balance = account.withdraw(1000);
		
		System.out.println(" Final Balance = "+balance);
		}
		catch(BalanceException e)
		{
			System.err.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		

	}

}
