package com.homepractice;

public class Sixtynineprogramm 
{
	int a;
	double d;
	
	{
		a=10;
		d=142.145;
	}
	public void test()
	{
		System.out.println(a);
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
	System.out.println("main method started");	
	
	new Sixtynineprogramm().test();
	
	System.out.println("main method ended");
	}
}