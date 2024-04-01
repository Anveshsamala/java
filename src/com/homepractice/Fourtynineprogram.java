package com.homepractice;

public class Fourtynineprogram 
{
	static char ch='a';       ///static data member
	static boolean res=true;  ///static data member
		double b=4.5;         ///non static data member
	
	public void test()       ///non static method
	{
		System.out.println("non static test method");
	}
	public static void best()//static method
	{
		System.out.println("static best method");
	}
public static void main(String[] args) 
{
System.out.println("main method started");
System.out.println("ch= "+Fourtynineprogram.ch);
System.out.println("res= "+Fourtynineprogram.res); 
Fourtynineprogram ref=new Fourtynineprogram();
System.out.println("b= "+ref.b);
ref.test();
Fourtynineprogram.best();

System.out.println("main method ended");
}
}
