package com.auginheritance;

public class Overloadsubclass1 extends Overloadsubclass
{
public static void main(String[] args) 
{
System.out.println("main method started");

Overloadsubclass ref=new Overloadsubclass();
ref.smile(5255);
ref.smile(0.155f);

System.out.println("main method ended");
}
}
