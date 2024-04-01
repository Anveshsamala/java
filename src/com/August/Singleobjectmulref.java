package com.August;

public class Singleobjectmulref 
{
int a=426;
double d=145.525;
String s="sgbdhrjf";
public static void main(String[] args) 
{
System.out.println("main method started");

Singleobjectmulref ref=new Singleobjectmulref();
System.out.println(ref.s);

Singleobjectmulref ref1=ref;
System.out.println(ref1.s);

Singleobjectmulref ref2=ref1;
System.out.println(ref2.s);

System.out.println("main method ended");
}
}
