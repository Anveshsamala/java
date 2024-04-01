package com.staticnonstatic;

public class Constructor4 
{
	int a;
	String b;
	float f;
	Constructor4()
	{
		a=45;
		System.out.println(a);
	}
	Constructor4(String b)
	{
		this();
		System.out.println(b);
	}
	Constructor4(float f)
	{
		this("rahul.....");
		System.out.println(f);
	}
	Constructor4(double d)
	{
		this(4.5f);
	System.out.println(d);
	}
	public static void main(String[] args) 
	{
		System.out.println("main method started");
Constructor4 ref=new Constructor4(147.258);		
		System.out.println("main method ended");
	}

}
