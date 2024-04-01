package com.qspiders.testing;

public class Program7 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Demo5 d1=new Demo5();
System.out.println("d1.hascode="+d1.hashCode());
System.out.println("d1="+d1);
Demo5 d2=new Demo5();
System.out.println("d2.hascode="+d2.hashCode());
System.out.println("d2="+d2);
System.out.println("main method ended");
System.out.println(0x15db9742);
System.out.println(0x6d06d69c);
}
}
