package com.August;

public class Statics2 
{
static float f=0.1f;
public static void red()
{
	System.out.println("static method");
}

public static void main(String[] args) 
{
System.out.println("main method started");

System.out.println(Statics1.a);
Statics1.join();

System.out.println(f);
red();

System.out.println("main method ended");
}

}
