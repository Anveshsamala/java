package com.oops1;

public class Accessoutsideclass 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
	Accesswithinclass a1=new Accesswithinclass();
	a1.main();
	System.out.println("main method ended");
}
}
