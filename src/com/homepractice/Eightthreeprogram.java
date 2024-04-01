package com.homepractice;

public class Eightthreeprogram 
{
	public void general()
	{
		System.out.println("zero argumernt method");
	}
	public void general(int a)
	{
		System.out.println("int argumentt method");
	}
	public void general(float f)
	{
		System.out.println("float argument method");
	}
	public void general(double d)
	{
		System.out.println("double argument method");
	}
	public void general(String s1)
	{
		System.out.println("String argument method");
	}
public static void main(String[] args) 
{
System.out.println("main mmethod started");

Eightthreeprogram ref=new Eightthreeprogram();
ref.general();
ref.general(143);
ref.general(1.5f);
ref.general(1475458.15458);
ref.general("samala brothers");

System.out.println("main method ended");
}
}
