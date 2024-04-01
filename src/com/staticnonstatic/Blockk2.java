package com.staticnonstatic;

public class Blockk2 
{
static int b;
long k;
double d;
{
	System.out.println("non static blocks");
	k=147852963;
	d=1258.4585;
}
static 
{
	System.out.println("static blocks");
	b=142;
}
public static void main(String[] args) 
{
System.out.println("main method started");
Blockk2 ref=new Blockk2();
System.out.println(ref.k);
System.out.println(ref.d);
System.out.println(b);
System.out.println("main method ended");
}
}
