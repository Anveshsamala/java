package com.August;

import java.util.Scanner;

public class Scanner2 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Scanner sc=new Scanner(System.in);
System.out.println("enter a= ");
int a=sc.nextInt();

System.out.println("enter b= ");
int b=sc.nextInt();

int result=a+b;
System.out.println("result= "+result);

System.out.println("enter String value= ");
String s2=sc.next();



System.out.println("main method ended");
}
}
