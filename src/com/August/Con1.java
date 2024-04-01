package com.August;

public class Con1 
{
int a;
Con1(int b)
{
	System.out.println(a);
	System.out.println("constructor");
	a=b;
}
public static void main(String[] args) 
{
System.out.println("main method started");

Con1 ref=new Con1(14555);
System.out.println(ref.a);



System.out.println("main method ended");
}
}
