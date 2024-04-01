package com.homepractice;
class Benz
{
	Benz()
	{
		System.out.println("abstract class have constructor ");
	}
	static int a=10;
	double b=5246.1555;
	public void test()
	{
		System.out.println("it support non static method");
	}
	public static void rest()
	{
		System.out.println("it support Static method");
	}
	
}
class Benz2 extends Benz
{
	
}
public class Hundredoneprogram 
{
	public static void main(String[] args) 
	{
		Benz2 b2=new Benz2();
		System.out.println(Benz.a);
		System.out.println(b2.b);
		Benz.rest();
		b2.test();
	}

}
