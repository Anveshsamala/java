package com.August;

public class Aaaa 
{
	static int a=555;
	static char ch='s';
	public static void joy()
	{
		System.out.println("joy method");
	}
	public void jill()
	{
		System.out.println("jill method");
	}
public static void main(String[] args) 
{
	System.out.println("main method started");
	
	System.out.println(a);
	System.out.println(ch);
	joy();
	Aaaa ref=new Aaaa();
	ref.jill();
	
	System.out.println(A.a);
	System.out.println(A.f);
	
	A.a=444;
	System.out.println(A.a);
	
	ref.a=147258;
	System.out.println(ref.a);
	
	
	System.out.println("main method ended");
}
	
}
