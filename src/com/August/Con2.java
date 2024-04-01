package com.August;

public class Con2 
{

Con2(int a)
{
	this("samala");
	System.out.println("int constructor");
	System.out.println(a);
}
Con2(int b, float f)
{
	this(5);
	System.out.println("Int and float constructor");
	System.out.println(b);
	System.out.println(f);
}
Con2(String s1)
{
	System.out.println("String argument");
	System.out.println(s1);
}
public static void main(String[] args) 
{
System.out.println("main method started");

Con2 ref=new Con2(6,0.1f);

System.out.println("main method ended");
}
}
