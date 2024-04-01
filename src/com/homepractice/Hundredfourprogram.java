package com.homepractice;
interface Zoo1
{
	public static final int a=10;
	public abstract void tend();
}
class Zoo2 implements Zoo1
{
	public void tend()
	{
		System.out.println("implementation");
	}
}
public class Hundredfourprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");	
Zoo1 z=new Zoo2();
System.out.println(Zoo1.a);
z.tend();
System.out.println("main method ended");
}
}
