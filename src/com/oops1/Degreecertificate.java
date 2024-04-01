package com.oops1;
abstract class Degree
{
	public abstract void Firstyear();
	public abstract void Secondyear();
	public abstract void Thirdyear();
	public abstract void Fourthyear();
}
abstract class First1 extends Degree
{
	public void Firstyear()
	{
		System.out.println("First year cleared successfully");
	}
}

abstract class Second extends First1
{
	public void Secondyear()
	{
		System.out.println("Second year cleared successfully");
	}
}
abstract class Third extends Second
{
	public void Thirdyear()
	{
		System.out.println("Third year cleared successfully");
	}
}
 class Finall extends Third
{
	public void Fourthyear()
	{
		System.out.println("Final year cleared successfully");
	}
}

public class Degreecertificate 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Finall f2=new Finall();
f2.Firstyear();
f2.Secondyear();
f2.Thirdyear();
f2.Fourthyear();
System.out.println("main method ended");
}
}
