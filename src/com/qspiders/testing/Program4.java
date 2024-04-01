package com.qspiders.testing;

public class Program4 
{
public double b=555.5;
public void end()
{
	System.out.println("excuting end method");
}
public static void main(String[] args) 
{
System.out.println("main method started");
Program4 ref1=new Program4();
System.out.println("b="+ref1.b);
ref1.end();
System.out.println("main method ended");
}
}
