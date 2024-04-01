package com.homepractice;
class PProgram1
{
	public void test()
	{
		System.out.println("test method");
	}
}
class PProgram2 extends PProgram1
{
	public void disp()
	{
		System.out.println("disp method");
	}
	public void start()
	{
		System.out.println("start method");
	}
}
class PProgram3 extends PProgram2
{
	int a=78;
	int b=88;
}
public class Nintythreeprogram 
{
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	
	PProgram3 ref=new PProgram3();
	ref.test();
	ref.disp();
	ref.start();
	System.out.println("a= "+ref.a);
	System.out.println("b= "+ref.b);
	
	System.out.println("main method ended");
	}

}
