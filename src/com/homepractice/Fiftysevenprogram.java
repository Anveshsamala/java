package com.homepractice;
class Aeroplane
{
	static int noofwings=2;
	static String s1="flying in the sky";
	public static void fly()
	{
		System.out.println("static fly method implemented");
	}
}
 public class Fiftysevenprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");
System.out.println("no of wings= "+Aeroplane.noofwings);
System.out.println("s1= "+Aeroplane.s1);
Aeroplane.fly();

System.out.println("main method ended");
}
}
