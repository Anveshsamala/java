package com.oops1;
interface aaa1
{
	void test();
}
interface aaa2 extends aaa1
{
	void disp();
}
class aaa3
{
	public void start()
	{
		System.out.println("start method implementation");
	}
}
	class aaa4 extends aaa3
	{
		public void test()
		{
			System.out.println("test method implementation");
		}
		public void disp()
		{
			System.out.println("disp method implementation");
		}
	
}
public class Interface6 
{
public static void main(String[] args) 
{
System.out.println("main method started");	
aaa4 a4=new aaa4();
a4.disp();
a4.start();
a4.test();
System.out.println("main method ended");
}
}
