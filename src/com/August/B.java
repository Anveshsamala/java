package com.August;

public class B 
{
	int a=55;
	float f=4.1578f;
	public void red()
	{
		System.out.println("red method");
	}
public static void main(String[] args) 
{
System.out.println("main method started");
B ref=new B();

System.out.println(ref.a);
System.out.println(ref.f);
ref.red();

System.out.println("main method ended");
}
}
