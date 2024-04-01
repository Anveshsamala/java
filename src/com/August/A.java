package com.August;

public class A 
{
static int a=10;
static float f =0.1f;
public static void test()/////////////////access static members of same class
{
	System.out.println("test method");
}
public static void rest()
{
	System.out.println("rest method");
}
 public static void main(String[] args) 
 {
	System.out.println("main method started");
	
	System.out.println(a);
	System.out.println(f);
	test();
	rest();
	
	System.out.println("main method ended");
 }
}
