package com.staticnonstatic;

public class Constructor1 
{
	int a;
	String b;
	double c;
	Constructor1()
	{
	a=14;
	b="ANVESH";
	c=147.258;
	}
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	System.out.println(new Constructor1().a);
	System.out.println(new Constructor1().b);
	System.out.println(new Constructor1().c);
	System.out.println("main method ended");


	}

}
