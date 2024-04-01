package com.homepractice;
class Zoom1
{
	public static void test()
	{
		System.out.println("static test method");
	}
}
class Zoom2
{
	public static void best()
	{
		System.out.println("static best method");
	}
}
class Zoom3
{
	public static void rest()
	{
		System.out.println("static rest  method");
	}
}
public class Fourtyeightprogram 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
	
Zoom1.test();
Zoom2.best();
Zoom3.rest();
	
	System.out.println("main method ended");
}
}
