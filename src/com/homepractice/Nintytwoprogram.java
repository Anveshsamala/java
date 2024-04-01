package com.homepractice;
class Demo5
{
	int a=143;
	
}
class Program1 extends Demo5
{
	public void test(Demo5 d5)
	{
		System.out.println("demo5 inside test method");
	}
}
public class Nintytwoprogram 
{

	public static void main(String[] args) 
	{
	System.out.println("main method started");
	
	Program1 ref=new Program1();
	ref.test(new Demo5());
	System.out.println("a= "+ref.a);
	
	System.out.println("main mmethod ended");

	}

}
