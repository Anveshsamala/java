package com.qspiders.testing;

public class Program6
{
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	Sample2 s1=new Sample2();
	System.out.println("s1.tostring()="+s1.toString());
	String s2=s1.toString();
	System.out.println("s2.tostring="+s2);
	System.out.println("main method ended");
	}
}
