package com.jspiders.dailywise;

public class Program8 
{
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	
	int a=54;
	System.out.println(a);
	Integer ref1=new Integer(a); //create an Object for integer
	System.out.println(ref1.toString());
	
	double b=25.58;
	System.out.println(b);
	Double ref2=new Double(b);
	System.out.println(ref2.toString());
	
	Float c=2.147f;
	System.out.println(c.toString());
	
	System.out.println("main method ended");
	}
}
