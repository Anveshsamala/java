package com.homepractice;

public class Seventyoneprogramm 
{
	int a;
	static boolean b;
	long l;
	static
	{
		System.out.println("static blocks");
		b=true;
	}
	{
		System.out.println("non static blocks");
		a=1000;
		l=8499099085l;
	}
public static void main(String[] args) 
{
System.out.println("main method started");

System.out.println(b);
System.out.println(new Seventyoneprogramm().a);
System.out.println(new Seventyoneprogramm().l);


System.out.println("main method ended");
}
}
