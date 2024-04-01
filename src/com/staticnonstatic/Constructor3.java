package com.staticnonstatic;
public class Constructor3
{
	int a;
	String s3;
	double b;
	Constructor3(int b)
	{
		a=b;
		System.out.println(a);
	}
	Constructor3(String s3)
	{
		
		this(45);
		System.out.println(s3);
	}
	Constructor3(double b)
	{
		
		this("anvesh");
		System.out.println(b);
	}
	public static void main(String[] args)
	{
	System.out.println("main method started");
	Constructor3 ref=new Constructor3(45.145);
	
	
	
	System.out.println("main method ended");

	}
}
