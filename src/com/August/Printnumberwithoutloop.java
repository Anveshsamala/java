package com.August;

public class Printnumberwithoutloop 
{
	public static void print(int num)
	{
		if(num<=10)
		{
			System.out.println(num);
			num++;
			print(num);
		}
	}
public static void main(String[] args) 
{
System.out.println("main method started");

print(1);

System.out.println("main method ended");
}
}
