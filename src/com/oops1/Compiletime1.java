package com.oops1;
class Gmail
{
	public void composeMessage1()
	{
	System.out.println("full screen implementation");	
	}
	public void composeMessage1(int a)
	{
		System.out.println("integer a="+a);
	System.out.println("pop up screen implementation");	
	}
	public void composemessage1(String data)
	{
		System.out.println("String data="+data);
		System.out.println("String representation");
	}
	public void composemessage1(double b)
	{
		System.out.println("double b="+b);
		System.out.println("double representation");
	}
}
public class Compiletime1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Gmail g1=new Gmail();
g1.composeMessage1(578);
System.out.println("main method ended");
}
}
