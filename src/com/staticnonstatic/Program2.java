package com.staticnonstatic;
class sample1
{
	static int a=10;
	public static void start()
	{
		System.out.println("static method same class");
	}
	
}
public class Program2 
{
public static void main(String[] args) {
	System.out.println("Sample1="+sample1.a);
	sample1.start();
}
}
