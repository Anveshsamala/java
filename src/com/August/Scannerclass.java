package com.August;

import java.util.Scanner;

public class Scannerclass 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Scanner sc=new Scanner(System.in);
System.out.println("enter value of a= ");
int a=sc.nextInt();

System.out.println("enter value of b= ");
int b=sc.nextInt();

int c=a+b;
System.out.println(c);

System.out.println("enter a String = ");
String s1=sc.next();


System.out.println("main method ended");
}
}
