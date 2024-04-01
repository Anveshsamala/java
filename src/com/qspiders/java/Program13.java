package com.qspiders.java;

public class Program13
{
	public static void main(String[] args)
{
	
System.out.println("main method started");
String s1="java";
System.out.println("s1="+s1);
String s2=new String("java");
System.out.println("s2="+s2);
String s3="java";
System.out.println("s3="+s3);
String s4=new String("java");
System.out.println("s4="+s4);
System.out.println(s1==s3);
System.out.println(s2==s4);
System.out.println(s1==s2);
System.out.println(s3==s4);
System.out.println("main method ended");
}
}
