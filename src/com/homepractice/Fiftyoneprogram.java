package com.homepractice;
class Zoom4
{
	static int a=10;
	static boolean b=true;
	public static void rest()
	{
		System.out.println("static test method....");
	}
}
class Zoom5
{
	static float f=1.5f;
	static long l=8499099085l;
	public static void best()
	{
		System.out.println("static best method");
	}
}
public class Fiftyoneprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

System.out.println("a= "+Zoom4.a);
System.out.println("b= "+Zoom4.b);
Zoom4.rest();


System.out.println("f= "+Zoom5.f);
System.out.println("l= "+Zoom5.l);
Zoom5.best();


System.out.println("main  method ended");
}
}
