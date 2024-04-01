package com.August;

public class Con3
{
	Con3(int a)
	{
		System.out.println("int argument");
		System.out.println(a);
	}
	Con3(float d)
	{
		this(55);
		System.out.println("double argument");
		System.out.println(d);
	}
	Con3(String s2)
	{
		this(0.1f);
		System.out.println("String argument");
		System.out.println(s2);
	}
public static void main(String[] args) 
{
System.out.println("main method started");

Con3 ref=new Con3("RAHUL");

System.out.println("main method ended");
}
}
