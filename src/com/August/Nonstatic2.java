package com.August;

public class Nonstatic2 
{
int b=546;
double d=8499099085.02;
public void jell()
{
	System.out.println("non static method");
}
public static void main(String[] args) 
{
System.out.println("main method started");

Nonstatic2 ref2=new Nonstatic2();

System.out.println(ref2.b);
System.out.println(ref2.d);
ref2.jell();

Nonstatic1 ref1=new Nonstatic1();
System.out.println(ref1.a);
System.out.println(ref1.s1);
ref1.egg();

System.out.println("main method ended");
}
}
