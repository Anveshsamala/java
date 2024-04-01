package com.homepractice;
class Zoom18
{
	int a=555;
}
class Zoom19 extends Zoom18
{
	int a=88;
	Zoom19()
	{
		System.out.println(super.a);
	}
}
public class Eightytwoprogramm 
{

	public static void main(String[] args) 
	{
		System.out.println("main method started");
		
		Zoom19 ref=new Zoom19();
		System.out.println("super= "+ref.a);
		
		System.out.println("main method ended");
	}
}
