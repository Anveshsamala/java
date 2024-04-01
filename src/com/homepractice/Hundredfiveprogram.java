package com.homepractice;
interface Programa1
{
	public abstract void test();
	public abstract void disp();	
}
class Programa2 implements Programa1
{
	public void test()
	{
		System.out.println("implementation test method");
	}
	public void disp()
	{
		System.out.println("implementation disp method");
	}
}
public class Hundredfiveprogram 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Programa2 p2=new Programa2();
		p2.test();
		p2.disp();
		System.out.println("main method ended");
	}
}
