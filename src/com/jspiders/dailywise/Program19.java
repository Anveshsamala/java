package com.jspiders.dailywise;

class InvalidAttendanceException extends Exception
{
	InvalidAttendanceException()
	{
		System.out.println("in valid attendance exception");
	}
}
class Entryfornextyear
{
	public void attendance(double per) throws InvalidAttendanceException
	{
		if(per>=75.00)
		{
			System.out.println("eligible for next year");
			System.out.println("good percentage");
			System.out.println("attend next year classe");
		}
		else
		{
			throw new InvalidAttendanceException();
		}
	}
	
}
public class Program19 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Entryfornextyear en=new Entryfornextyear();
try
{
	en.attendance(80.00);
}
catch(InvalidAttendanceException ref)
{
	System.out.println("exception in main");
}
System.out.println("main method ended");
}
}
