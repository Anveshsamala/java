package com.homepractice;

public class Thirtysixprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int num=9;
System.out.println("number= "+num);
int count=0;

for(int i=2;i<=num/2;i++)
{
	if(num%i==0)
	{
		count++;
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
