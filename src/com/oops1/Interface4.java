package com.oops1;
interface one1
{
	void test();
}
interface One2
{
	void start();
}
class Two1
{
	public void test()
	{
		System.out.println("test method implementation");
	}
}
class Two2 extends Two1
{
	public void start()
	{
		System.out.println("start method implementation");
	}
}
public class Interface4 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Two2 t2=new Two2();
t2.start();
t2.test();
System.out.println("main method ended");
}
}
