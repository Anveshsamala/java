package com.homepractice;
class Abc
{
	public void study()
	{
		System.out.println("testing is easy");
	}
}
class Abc1 extends Abc
{
	public void study()
	{
		System.out.println("java is easy");
	}
}
public class Nintysevenprogram 
{

	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Abc1 ref=new Abc1();
		ref.study();
		System.out.println("main method ended");
	}

}
