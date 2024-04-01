package com.jspiders.dailywise;
class InvalidAgeException extends Exception
{
	InvalidAgeException()
	{
		System.out.println("invalid age exception");
	}
}
class BookTickets
{
	public void registered(double age) throws InvalidAgeException
	{
		if(age>=18.00)
		{
			System.out.println("eligible for Book Tickets");
			System.out.println("see the movies");
			System.out.println("see horror films also");
		}
		else
		{
			throw new InvalidAgeException();
		}
	}
}
public class Program20 
{
public static void main(String[] args) 
{
System.out.println("main method started");

BookTickets bt=new BookTickets();
try
{
	bt.registered(1.00);
}
catch(InvalidAgeException ref)
{
	System.out.println("exception handled");
}
System.out.println("main method ended");
}
}
