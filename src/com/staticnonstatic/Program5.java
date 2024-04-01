package com.staticnonstatic;

public class Program5 
{
int a=555;
double b=78.52;
public void test()
{
	System.out.println("non static test method");
}
public static void main(String[] args) {
	System.out.println(new Program5().a);
	System.out.println(new Program5().b);
	new Program5().test();
}
}
