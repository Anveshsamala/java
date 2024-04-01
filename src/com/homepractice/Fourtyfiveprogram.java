package com.homepractice;

public class Fourtyfiveprogram 
{
	public static int maximum(int a,int b,int c)
	{
		System.out.println("enter a= "+a);
		System.out.println("enter b= "+b);
		System.out.println("enter c= "+c);
		
		if(a>b&&a>c)
		{
			return a;
		}
		if(b>c)
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

int result =maximum(8,552,3);
System.out.println("maximum value = "+result);

System.out.println("main method ended");
}
}
