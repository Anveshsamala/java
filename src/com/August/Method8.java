package com.August;

public class Method8 
{
	public static boolean map(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
		
		if(a%10==b%10)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void men(boolean r)
	{
		if(r==true)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
public static void main(String[] args) 
{
System.out.println("main method started");

boolean res=map(3,113);
men(res);

System.out.println("main method ended");
}
}
