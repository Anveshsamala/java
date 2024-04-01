package com.homepractice;
class Facebook1
{
	public void version1()
	{
		System.out.println("for message full page is open");
	}
}
class Facebook2 extends Facebook1
{
	public void version2()
	{
	System.out.println("for message small popup page is displayed");	
	}
}
public class Seventyeightprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Facebook2 ref=new Facebook2();
ref.version2();
ref.version1();

System.out.println("main method ended");
}
}
