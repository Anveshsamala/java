package com.jspiders.dailywise;

class InvalidPercentageException extends Exception
{
	InvalidPercentageException() 
	{
	System.out.println("invalid percentage exception");	
	}
}

class InterviewRegistration
{
	public void register(double marks) throws InvalidPercentageException
	{
		if(marks>=60.00)
		{
			System.out.println("proceed percentage");
			System.out.println("proceed to registration");
			System.out.println("registration successfully");
		}
		else
		{
			throw new InvalidPercentageException();
		}
	}
}
public class Program18 
{
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	InterviewRegistration ir=new InterviewRegistration();
	try
	{
	ir.register(78.00);
	}
	catch(InvalidPercentageException ref)
	{
		
	}
	
	System.out.println("main method ended");
	}

}
