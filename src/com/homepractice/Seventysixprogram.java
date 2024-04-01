package com.homepractice;
class Zoom10
{
	public void rest()
	{
		System.out.println("first method");
	}
}
class Zoom11 extends Zoom10
{
	public void test()
	{
		System.out.println("second method");
	}
}
public class Seventysixprogram  extends Zoom11
{
public static void main(String[] args) 
{
System.out.println("main method started");


System.out.println("third method");
Zoom11 ref=new Zoom11();
ref.test();
ref.rest();
System.out.println("main method ended");
}
}
