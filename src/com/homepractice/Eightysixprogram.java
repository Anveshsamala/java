package com.homepractice;
public class Eightysixprogram 
{
	public static void test()
	{
		System.out.println("zero argument method");
	}
	public static void test(int a)
	{
		System.out.println("int argumment method");
	}
	public static void test(long l)
	{
		System.out.println("long argument method");
	}
	public static void test(String s1)
	{
		System.out.println("String argument method");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		
		Eightysixprogram ref=new Eightysixprogram();
		ref.test();
		ref.test(143);
		ref.test(8499099085l);
		ref.test("smmala brothers");
		
		System.out.println("main method ended");
	}
}
