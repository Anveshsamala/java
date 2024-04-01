package com.interview;

public class Program2 
{
public static void main(String[] args) 
{
System.out.println("main method started");
String s1="hi there";
char [] ch=s1.toCharArray();


if(s1.charAt(0)=='h'&&s1.charAt(1)=='i')
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
System.out.println("main method ended");
}
}
