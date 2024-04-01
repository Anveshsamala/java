package com.auginheritance;

public class D4 
{
public static void main(String[] args) 
{
System.out.println("main method started");	

D2 ref=new D3();

System.out.println(ref.a);
ref.start();
ref.test();


System.out.println("main method ended");
}
}
