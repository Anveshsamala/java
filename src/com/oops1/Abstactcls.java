package com.oops1;
abstract class Abstr
{
	public abstract void test();
	
}
class Abstract
{
	public void test()
	{
		System.out.println("abstract method");
	}
}
public class Abstactcls 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Abstract a1=new Abstract();
a1.test();
System.out.println("main method ended");
}
}
