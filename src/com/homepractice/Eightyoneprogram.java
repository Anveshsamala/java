package com.homepractice;
class Zoom12
{
	Zoom12()
	{
		System.out.println("zero argument constructor");
	}
}
class Zoom13 extends Zoom12
{
	Zoom13(int a)
	{
		super();
		System.out.println("int argument constructor");
	}
}
class Zoom14 extends Zoom13
{
	Zoom14(double b)
	{
		super(555);
		System.out.println("double argument constructor");
	}
}
class Zoom15 extends Zoom14
{
	Zoom15(String s1)
	{
		super(143.143);
		System.out.println("string argument constructor");
	}
}
class Zoom16  extends Zoom15
{
	Zoom16(float f)
	{
		super("ANVESHRAJURAHUL");
		System.out.println("float argument constructor");
	}
}
public class Eightyoneprogram 
{
	public static void main(String[] args) 
{
System.out.println("main method started");

Zoom16 ref=new Zoom16(1.5f);

System.out.println("main method ended");
}
}
