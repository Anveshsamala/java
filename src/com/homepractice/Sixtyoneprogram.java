package com.homepractice;
class Clock
{
	static int noofhands=3;
	char ch='d';
	public static void display()
	{
		System.out.println("static display method");
	}
	public void setTime()
	{
		System.out.println("non static settime method");
	}
	public static void lesson()
	{
		System.out.println("work like me 24/7");
	}
	
}
public class Sixtyoneprogram 
{
int a=78;

public static void test()
{
	System.out.println("static test method");
}
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	
	System.out.println("no of hands= "+Clock.noofhands);
	Clock ref=new Clock();
	System.out.println("ch= "+ref.ch);
	Clock.display();
	Clock.lesson();
	System.out.println("a= "+new Sixtyoneprogram().a);
	test();
	
	
	System.out.println("main method ended");

	}

}
