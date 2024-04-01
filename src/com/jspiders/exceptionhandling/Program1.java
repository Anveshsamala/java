package com.jspiders.exceptionhandling;

public class Program1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
try
{
int a=50;
System.out.println(a);
int b=0;
System.out.println(b);
double res=a/b;
System.out.println(res);
}
catch(ArithmeticException ref)
{
System.out.println("Exception handling");
System.out.println("alternate .....");
}
System.out.println("main method ended");
}
}
