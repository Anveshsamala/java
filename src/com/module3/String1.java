package com.module3;
class Sample1
{
	@Override
public String toString()
{
	return "change the implementation";
}
}
public class String1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Sample1 ref=new Sample1();
System.out.println(ref);
String s2=ref.toString();
System.out.println(s2);
System.out.println("main method ended");
}
}
