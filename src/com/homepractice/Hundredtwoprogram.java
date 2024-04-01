package com.homepractice;
abstract class Interview
{
	public abstract void apti();
	public abstract void tech();
	public abstract void hr();
	}
abstract class Dayone extends Interview
{
	public void apti()
	{
		System.out.println("cleared apti round successfully");
	}
}
abstract class Daytwo extends Dayone
{
	public void tech()
	{
		System.out.println("cleared tech round successfully");
	}
}
class Thirdday  extends Daytwo
{
	public void hr()
	{
		System.out.println("cleared hr round successfully");
	}
}
public class Hundredtwoprogram 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
	Thirdday t3=new Thirdday();
	t3.apti();
	t3.tech();
	t3.hr();
	System.out.println("main method ended");
}
}
