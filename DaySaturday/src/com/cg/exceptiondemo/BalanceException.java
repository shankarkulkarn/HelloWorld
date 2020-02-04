package com.cg.exceptiondemo;

public class BalanceException extends Exception {

	
	public BalanceException(String message)
	{
		super(message);
	}
	
	public BalanceException()
	{
		super();
	}
}
