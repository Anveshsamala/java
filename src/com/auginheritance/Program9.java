package com.auginheritance;

public class Program9 
{
public static void main(String[] args) 
{
System.out.println("main method atarted");

Program6 ref=new Program8();
System.out.println(ref.a);

Program7 ref1=(Program7)ref;

ref1.start();
ref1.end();
System.out.println(ref1.a);

System.out.println("main method ended");
}
}
