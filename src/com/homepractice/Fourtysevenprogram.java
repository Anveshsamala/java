package com.homepractice;
import java.util.Scanner;
public class Fourtysevenprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Scanner sc=new Scanner(System.in);
System.out.println("enter a= ");
int a=sc.nextInt();
System.out.println("enter b= ");
int b=sc.nextInt();
System.out.println("enter d= ");
double d=sc.nextDouble();

int c=a+b;
System.out.println("add value= "+c);


System.out.println("main method ended");
}
}
