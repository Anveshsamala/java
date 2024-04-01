package com.auginheritance;

public class Methoverriding3 
{
public static void main(String[] args) 
{
System.out.println("main method started");/////real time example for override is     modify the existing feature

Override1 ref=new Override1();/////////////method overriding not happend for static methods, private methods, constructors
ref.override();


System.out.println("main method ended");
}
}
