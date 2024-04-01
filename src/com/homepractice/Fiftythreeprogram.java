package com.homepractice;
class Zoom6
{
	int a=10;
	float f=1.5f;
	boolean b=true;
	public void three()
	{
		System.out.println("non static method three");
	}
	public void four()
	{
		System.out.println("non static method four");
	}
}
public class Fiftythreeprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

//System.out.println("a= "+new Zoom6().a);
//System.out.println("f= "+new Zoom6().f);
//System.out.println("b= "+new Zoom6().b);
//new Zoom6().three();
//new Zoom6().four();

Zoom6 ref=new Zoom6();
System.out.println("a= "+ref.a);
System.out.println("f= "+ref.f);
System.out.println("b= "+ref.b);
ref.three();
ref.four();

System.out.println("main method ended");
}
}
