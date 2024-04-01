package com.homepractice;

public class Seventyfiveprogram 
{
	Seventyfiveprogram()
	{
		System.out.println("zero argument constructor");
	}
	Seventyfiveprogram(int a)
	{
		this();
		System.out.println("int argument constructor");
	}
	Seventyfiveprogram(float f)
	{
		this(143);
		System.out.println("float argument constructor");
	}
	Seventyfiveprogram(String s1)
	{
		this(143.2f);
		System.out.println("String argument constructor");
	}
	Seventyfiveprogram(double d)
	{
		this("ANVESH");
		System.out.println("double argument constructor");
	}
public static void main(String[] args) 
{
System.out.println("main method started");

Seventyfiveprogram ref=new Seventyfiveprogram(143.225585);


System.out.println("main mmethod ended");
}
}
