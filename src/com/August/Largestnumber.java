package com.August;

public class Largestnumber 
{
	public static int max(int a, int b, int c)
	{
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		if(a>b&&a>c)
		{
			return a;
		}
		else if(b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
public static void main(String[] args) 
{
System.out.println("main method started");

int res=max(10,12,3);
System.out.println("max=" +res);

System.out.println("main method ended");
}
}
