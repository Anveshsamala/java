package com.August;

public class Sample2 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Sample1 ref=new Sample1();
System.out.println(ref.a);

Sample1 ref1=new Sample1();
System.out.println(ref1.a);

ref1.a=5654;
System.out.println(ref.a);
System.out.println(ref1.a);

System.out.println("main method ended");
}
}
