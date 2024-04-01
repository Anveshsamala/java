package com.homepractice;
class General
{
	
	int a;
	General(int b)
	{
	System.out.println("a= "+a);
	System.out.println("argument constructor");
	a=b;
	}
}
public class Seventytwoprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

General ref=new General(1425758);
System.out.println(ref.a);
System.out.println();

System.out.println("main method ended");
}
}
