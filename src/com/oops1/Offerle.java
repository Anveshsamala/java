package com.oops1;
abstract class Offerletter
{
	public abstract void apti();
	public abstract void tech();
	public abstract void hr();
}
abstract class Firstday extends Offerletter
{
	public void apti()
	{
		System.out.println("apti round clear successfully");
	}
}
abstract class Secondday extends Firstday
{
	public void tech()
	{
		System.out.println("tech round clear successfully");
	}
} 
 class Finalday extends Secondday
{
	public void hr()
	{
		System.out.println("hr round clear successfully");
	}
}
public class Offerle 
{
public static void main(String[] args) 
{
System.out.println("mainmethod started");
Firstday f1=new Finalday();
f1.apti();
f1.tech();
f1.hr();
System.out.println("main method ended");
}
}
