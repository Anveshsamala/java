package com.staticnonstatic;

public class Constructor2 
{
	int a; 
	String s1;
	boolean b;
Constructor2()
{
a=57;	
}
Constructor2(String s1)
{
this.s1=s1;	
}
Constructor2(boolean b)
{
	
	this.b=b;
}
public static void main(String[] args)
{
System.out.println("main ethod started");
Constructor2 ref =new Constructor2(true);
System.out.println(ref.b);
System.out.println("main method ended");
}
}
