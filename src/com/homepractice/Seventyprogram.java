package com.homepractice;

public class Seventyprogram 
{
	static int a;
	static
	{
		System.out.println("excuting static blocks");
		a=100;
	}
public static void main(String[] args) 
{
System.out.println("main mmethod started");

System.out.println(a);

System.out.println("main mmethod ended");
}
}
