package com.exceptionsmodule3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter value of a=");
int a=sc.nextInt();
System.out.println("enter value of b=");
int b=sc.nextInt();
int c=a/b;
System.out.println("c="+c);
}
catch(ArithmeticException ref)
{
	System.out.println("ArithmaticException to handle the exception");
}
catch(InputMismatchException ref1)
{
	System.out.println("InputmismatchException to handle the exception");
}
catch(Exception ref2)
{
	System.out.println("Exceptiongeneral");
}
System.out.println("main method ended");
}
}
