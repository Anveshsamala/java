package com.auginheritance;

public class Demo3 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Demo2 ref=new Demo2();
ref.rest();
System.out.println(ref.a);
System.out.println(Demo1.d);
Demo1.test();

System.out.println("main method ended");
}
}
