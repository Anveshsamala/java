package com.homepractice;
abstract class Programm1
{
	public abstract void test();
}
class Program2 extends Programm1
{
	public void test()
	{
		System.out.println("implementation for abstract class in sub class");
	}
}
public class Hundredprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Program2 p2=new Program2();
p2.test();
System.out.println("main method ended");
}
}
