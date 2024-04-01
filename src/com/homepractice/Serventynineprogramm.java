package com.homepractice;
class Day1
{
	public void aptidudetest()
	{
		System.out.println("clear apti test");
	}
}
class Day2 extends Day1
{
	public void technicaltest()
	{
		System.out.println("clear technical test");
	}
}
class Day3 extends Day2
{
	public void hrround()
	{
		System.out.println("clear hr round ");
	}
}
class Day4 extends Day3
{
	public void finalround()
	{
		System.out.println("clear final round");
	}
}
class  Day5 extends Day4
{
	public void joining()
	{
		System.out.println("joining date confirmed");
	}
}
public class Serventynineprogramm 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Day5 ref=new Day5();
ref.joining();
ref.hrround();
ref.technicaltest();
ref.finalround();
ref.aptidudetest();

System.out.println("main method ended");
}
}
