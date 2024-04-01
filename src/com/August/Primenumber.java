package com.August;

public class Primenumber 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int n=99;
int count=0;
for(int i=2;i<=n/2;i++)
{
	if(n%i==0)
	{
		count++;
		break;
	}
}
	
	if(count==0)
	{
		System.out.println("its  prime number");
	}
	else
	{	
		System.out.println("its not a prime number");
	}


System.out.println("main method ended");
}
}
