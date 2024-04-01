package com.oops1;
class Demo1
{
	public void abc()
	{
		System.out.println("testing is easy");
	}
}
class Demo2 extends Demo1
{
	public void abc()
	{
		System.out.println("java is easy");
	}
}
public class Mainclass1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Demo1 d2=new Demo2();
d2.abc();
System.out.println("main method ended");
}
}
