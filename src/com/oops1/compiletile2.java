package com.oops1;
class Whatsupapp1
{
	public void version1()
	{
		System.out.println("only for messages");
	}
	public void version1(String s1)
	{
		System.out.println("String s1="+s1);
		System.out.println("only for special messages");
	}
	public void version1(double b)
	{
		System.out.println("double b="+b);
		System.out.println("only for double messages");
	}
}
public class compiletile2 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Whatsupapp1 w1=new Whatsupapp1();
w1.version1();
w1.version1(14.5588);
w1.version1("RAHUL");
System.out.println("main method ended");
}
}
