package com.August;

public class Method1 
{
public static void test()
{
	System.out.println("test method");
}
public static void main(String[] args) 
{
System.out.println("main method started");

test();
rest();
test();
rest();
test();
rest();
test();
rest();

System.out.println("main method ended");
}
public static void rest()
{
	System.out.println("rest method");
}
}
