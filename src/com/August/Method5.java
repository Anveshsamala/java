package com.August;

public class Method5 
{
	public static int mul(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
		
		int mul=a*b;
		return mul;
	}
public static void main(String[] args) 
{
System.out.println("main method started");

int m=mul(41, 85);
System.out.println(m);

System.out.println("main method ended");
}
}
