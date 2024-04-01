package com.August;

public class Primerecur 
{
	static int num=151;
	static int count=0;
public static void main(String[] args) 
{
System.out.println("main method started");

for(int i=2;i<=num/2;i++)
{
	if(num%i==0)
	{
		count++;
		break;
	}
}
if(count==0)
{
	System.out.println("prime number");
}
else
{
	System.out.println("not a prime number");
}

System.out.println("main method ended");
}
}
