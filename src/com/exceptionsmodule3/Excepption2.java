package com.exceptionsmodule3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepption2 
{
public static void main(String[] args) 
{
System.out.println("main method started");
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array size=");
int size=sc.nextInt();
int [] ar=new int[size];
System.out.println("enter index=");
int index=sc.nextInt();
System.out.println("enter value=");
int value=sc.nextInt();
ar[index]=value;
System.out.println(ar[index]);
int res=1/index;
System.out.println(res);
}
catch(ArrayIndexOutOfBoundsException ref)
{
	System.out.println("Array index outof bounds exception");
}
catch(ArithmeticException ref1)
{
	System.out.println("Arithmetic exception");
}
catch(InputMismatchException ref2)
{
	System.out.println("inputmismatch exception");
}
catch(Exception ref3)
{
	System.out.println("other exception");
}
 System.out.println("main method ended");
}
}
