package com.August;

public class Nonstatic1 
{
int a=5;
String s1="Chicken";
public void egg()
{
	System.out.println("non static method");
}
public static void main(String[] args) 
{
System.out.println("main method started");

Nonstatic1 ref=new Nonstatic1();
System.out.println(ref.a);
ref.egg();
System.out.println(ref.s1);

System.out.println("main method ended");
}
}
