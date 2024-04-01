package com.homepractice;
class PProgram5
{
	int a=89;
	public void start()
	{
		System.out.println("start method");
	}
}
class PProgram6 extends PProgram5
{
	double b=143.245;
	public void test()
	{
		System.out.println("test method");
	}
}
public class Nintyfiveprogram 
{

	public static void main(String[] args) 
	{
		System.out.println("main method started");
		PProgram6 ref=new PProgram6();
		ref.start();
		ref.test();
		System.out.println("a= "+ref.a);
		System.out.println("b= "+ref.b);
		System.out.println("main method ended");
	}
}
