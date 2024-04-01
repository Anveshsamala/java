package com.August;

public class Method6 
{
	public static int add(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
		
		int add=a+b;
		return add;
	}
	public static float div(int c,int d)
	{
		System.out.println(c);
		System.out.println(d);
		
		int div=c/d;
		return div;
	}
public static void main(String[] args) 
{
System.out.println("main method started");

int res=add(4,6);
System.out.println(res);

float res1=div(5,20);
System.out.println(res1);

System.out.println("main method ended");
}
}
