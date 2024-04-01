package com.jspiders.dailywise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program13 
{
public static void main(String[] args) 
{
System.out.println("main method started");

try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int size=sc.nextInt();
int [] ar=new int[size];

System.out.println("enter the index ");
int index=sc.nextInt();
System.out.println("index="+index);

System.out.println("enter the value");
int value=sc.nextInt();
System.out.println("value="+value);
ar[index]=value;
System.out.println(ar[index]);
int res=1/ar[index];
System.out.println(res);
}
catch(ArrayIndexOutOfBoundsException ref)
{
	System.out.println("array exception handler");
}
catch(InputMismatchException ref1)
{
	System.out.println("Input exception handler");
}
catch(ArithmeticException ref2)
{
	System.out.println("arithmatic exception handler");
}
catch(Exception ref3)
{
	System.out.println("unexpected exception handler");
}
System.out.println("main method ended");
}
}
