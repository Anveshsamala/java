package com.August;

public class Divisibleby3 
{
public static void main(String[] args) 
{
System.out.println("main method started");	

for(int a=1;a<=50;a++)
{
	if(a%3==0)
	{
		System.out.println(a);
	}
}

for(int b=100;b>=50;b=b-2)
{
	System.out.println(b);
}

for(char ch=65;ch<=90;ch++)
{
	if(ch%2==1)
	{
	System.out.println(ch);
	}
}

System.out.println("main method ended");
}
}
