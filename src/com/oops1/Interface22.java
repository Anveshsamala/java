package com.oops1;
interface Samp1   /////public abstract
{
	double b=555.4789;////public static final
	void abc();///public abstract
}
class Samp2 implements Samp1
{
	public void abc()
	{
		System.out.println("abc method implementation in sub class");
	}
}
public class Interface22 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Samp2 s2=new Samp2();
s2.abc();
System.out.println("main method ended");
}
}
