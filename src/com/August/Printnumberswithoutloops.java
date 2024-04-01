package com.August;

public class Printnumberswithoutloops 
{
public static void printa(int a)
{
if(a>=1)
{
	System.out.println(a);
	a--;
	printa(a);
}
}
public static void main(String[] args) 
{
System.out.println("main  method started");

printa(9);
printb(2);

System.out.println("main method ended");
}
public static void printb(int b)
{
	if(b<=9)
	{
		System.out.println(b);
		b++;
		printb(b);
	}
}
}
