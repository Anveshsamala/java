package com.oops1;
abstract class one
{
	one()
	{
		System.out.println("constructor class");
	}
	int a=50;
	static double b=45.687;
	public void run()
	{
		System.out.println("non static method");
	}
	public static void runner()
	{
		System.out.println("static method");
	}
}
class Two extends one
{
	
}
public class Abstract11 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Two t1=new Two();
System.out.println("a="+t1.a);
System.out.println("b="+one.b);
t1.run();
one.runner();
System.out.println("main method ended");
}
}
