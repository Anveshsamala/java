package com.homepractice;
class Sample1
{
	int a=78;
	public void test()
	{
		System.out.println("test method");
	}
}
class Sample2 extends Sample1
{
	public void start()
	{
		System.out.println("start mmethod");
	}
}
class Sample3 extends Sample2
{
	double b=143.257;
	public void end()
	{
		System.out.println("end method");
	}
}
public class nintythprogram 
{
	public static void main(String[] args) 
	{
	System.out.println("main method started");	

	Sample3 ref=new Sample3();
	System.out.println("a= "+ref.a);
	ref.test();
	ref.start();
	System.out.println("b= "+ref.b);
	ref.end();
	
	System.out.println("main method ended");
	}
}
