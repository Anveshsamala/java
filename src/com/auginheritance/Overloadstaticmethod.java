package com.auginheritance;

public class Overloadstaticmethod 
{
public static void walking(int a)
{
	System.out.println("int argument");
}
public static void walking(double d)
{
	System.out.println("double argument");
}
public static void main(String[] args) 
{
System.out.println("main method started");

Overloadstaticmethod ref=new Overloadstaticmethod();
ref.walking(455484.0545);
ref.walking(754845);

System.out.println("main method ended");
}
}
