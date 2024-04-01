package com.qspiders.java;

public class Program6 extends Sample2
{
public static void main(String[] args)
{
	System.out.println("main method started");
	Sample2 s1=new Sample2();
	String s2=s1.toString();
	System.out.println("s1.toString()="+s2);
	System.out.println("s1="+s1);
	System.out.println("main method ended");
}
}