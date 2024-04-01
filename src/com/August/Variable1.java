package com.August;

public class Variable1 
{
	static byte b;    ////static primitive global
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char ch;
	static String s1; ////static non primitive global
	
	int h=88;         ///global, primitive, non static
	String s3="Rahul";///global,non primitive,non static
	
	
public static void main(String[] args) 
{
System.out.println("main method started");

int g=10;             //// primitive
String s2="ANVESH";   ////Non primitive
System.out.println(g);
System.out.println(s2);

System.out.println(b);
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(f);
System.out.println(d);
System.out.println(ch);
System.out.println(s1);

System.out.println("main method ended");
}
}
