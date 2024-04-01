package com.jspiders.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program2 
{
public static void main(String[] args) 
{
	try
	{
System.out.println("main method started");
Scanner sc=new Scanner(System.in);

System.out.println("enter value of a");
int a=sc.nextInt();
System.out.println("a="+a);

System.out.println("enter value of b");
int b=sc.nextInt();
System.out.println("b="+b);

int res=a/b;
System.out.println("res="+res);
	}
	catch(ArithmeticException ref)
	{
	System.out.println("Exception handling");
	System.out.println("alternate method......");
	}
	catch(InputMismatchException ref)
	{
	System.out.println("Exception handling");
	System.out.println("alternate method......");
	}
System.out.println("main method ended");
}
}
