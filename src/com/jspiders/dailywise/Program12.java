package com.jspiders.dailywise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program12 
{
public static void main(String[] args) 
{
System.out.println("main method started");
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a");
int a=sc.nextInt();    ///risky line
System.out.println("a=" +a);

System.out.println("enter the value of b");
int b=sc.nextInt();    ///riskey line
System.out.println("b="+b);

int res=a/b;      //risky line
System.out.println("res="+res);
}
catch(ArithmeticException ref)
{
	System.out.println("arithmatic exception handler");
	System.out.println("alternate code...");
}

catch(InputMismatchException ref)
{
	System.out.println("input exception handler");
	System.out.println("alternate code...");
}

catch(Exception ref)
{
	System.out.println("arithmatic exception handler");
	System.out.println("alternate code...");
}
System.out.println("main method ended");
}
}
