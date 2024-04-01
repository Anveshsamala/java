package com.homepractice;
class Demo1
{
	public void end()
	{
		System.out.println("end method");
	}
}
class Demo2 extends Demo1
{
	boolean res=true;
	public void test()
	{
		System.out.println("test method");
	}
}
class Demo3 extends Demo2
{
	int d=34;
}
class Demo4 extends Demo3
{
	public void start()
	{
		System.out.println("start method");
	}
}
public class Nintyoneprogram 
{
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	
	Demo4 ref=new Demo4();
	ref.end();
	System.out.println("res= "+ref.res);
	ref.test();
	System.out.println("d= "+ref.d);
	ref.start();
	
	
	
	System.out.println("main method ended");
	}

}
