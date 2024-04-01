package com.homepractice;

public class Seventeenprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");
int num=15;
System.out.println("num= "+num);

if(num%3==0)
{
	System.out.println("number is divisible by 3");
}
else if(num%5==0)
{
	System.out.println("number is divisible by 5");
}
else if(num%3==0&&num%5==0)
{
	System.out.println("number is divisible by 3 and 5");
}
else
{
	System.out.println("number is divisible by  none");
}
System.out.println("main method ended");
}
}
