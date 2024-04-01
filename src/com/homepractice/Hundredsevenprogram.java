package com.homepractice;
interface Road
{
	public abstract void fly();
}
interface Car
{
	public abstract void moveonroad();
	
}
class Aeroplane0  implements Road,Car
{
	public void fly()
	{
		System.out.println("implementation of fly method");
	}
	public void moveonroad()
	{
		System.out.println("implementation of moveonroad method");
	}
}

public class Hundredsevenprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Aeroplane0 a=new Aeroplane0();
a.fly();
a.moveonroad();

System.out.println("main method ended");
}
}
