package com.August;

public class Blocks1 
{
	int a;
	float f;
	static int c;
	static double d;
	static
	{
		System.out.println("static blocks");
		c=14235;
		d=8499099029l;
		System.out.println(c);
		System.out.println(d);       /////////////static blocks
	}
	{
		System.out.println("non static blocks");
		a=142;
		f=0.1f;           
	}                                 ////////////non static blocks
public static void main(String[] args) 
{
System.out.println("Main method started");

Blocks1 b=new Blocks1();
System.out.println(b.a);
System.out.println(b.f);

System.out.println("main metod ended");
}
}
