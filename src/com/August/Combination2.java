package com.August;

public class Combination2 
{
int a=18;
public static void test()
{
	System.out.println("static same class method1");
}
public static void main(String[] args) 
{
System.out.println("main method started");

Combination2 ref=new Combination2();
System.out.println(ref.a);
test();

System.out.println(Combination1.noofhands);
Combination1 ref1=new Combination1();
System.out.println(ref1.type);
Combination1.displaytime();
ref1.settime();
Combination1.lesson();

System.out.println("main method ended");
}
}
