package com.August;

public class Method9 
{
public static void main(String[] args) 
{
System.out.println("main method started");


int num=15;
int count=0;

System.out.println(num);
System.out.println(count);

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
