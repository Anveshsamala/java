package com.staticnonstatic;
class sample2
{
	static int a=55;
	
}
public class Program4 
{
public static void main(String[] args) {
	System.out.println("a="+sample2.a);
	sample2.a=66;
	System.out.println(sample2.a);
	
}
}
