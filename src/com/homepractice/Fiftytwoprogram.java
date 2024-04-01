package com.homepractice;

public class Fiftytwoprogram 
{
	int a=10;
	double d=555.444;
	float f=1.05f;
	char ch='h';
	boolean b=true;
	public void one()
	{
		System.out.println("non static method one");
	}
	public void two()
	{
		System.out.println("non static method two");
	}
public static void main(String[] args) 
{
System.out.println("main method started");

System.out.println("a= "+new Fiftytwoprogram().a);
System.out.println("b= "+new Fiftytwoprogram().d);
System.out.println("f= "+new Fiftytwoprogram().f);
System.out.println("ch= "+new Fiftytwoprogram().ch);
System.out.println("b= "+new Fiftytwoprogram().b);
new Fiftytwoprogram().one();
new Fiftytwoprogram().two();

System.out.println("main method ended");
}
}
