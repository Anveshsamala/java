package com.homepractice;
interface Simple1
{
	public abstract void run(); 
}
interface Simple2 extends Simple1
{
	public abstract void walk();
}
class Simple3 implements Simple2
{
	public void run()
	{
		System.out.println("implementation run method");
	}
	public void walk()
	{
		System.out.println("implementation walk method");
	}
}
public class Hundredsixprogram 
{
public static void main(String[] args) 
{
System.out.println("main mthod started");
Simple2 s=new Simple3();
s.run();
s.walk();
System.out.println("main method ended");
}
}
