package com.August;

public class Statics1 
{
static int a=465;
public static void join()
{
	System.out.println("static method");
}
public static void main(String[] args) 
{
System.out.println("main method started");

System.out.println(a);
join();

System.out.println("main method ended");
}
}
