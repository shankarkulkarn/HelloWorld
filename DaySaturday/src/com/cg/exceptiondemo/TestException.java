package com.cg.exceptiondemo;

public class TestException {

	public static void main(String[] args) {
		
		try
		{
		int  a=  Integer.parseInt(args[0]);
		
		int b= Integer.parseInt(args[1]);
		
		int d  = a/ b;
		
		System.out.println(" Result = "+d);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
		System.out.println(" END ");
		}

	}

}
