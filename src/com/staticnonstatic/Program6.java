package com.staticnonstatic;
class Sample3
{
	int a=789;
	double b=789.123;
	public void retest()
	{
		System.out.println("non static different class retest method");
	}
}
public class Program6 
{
public static void main(String[] args) 
{
Sample3 s3=new Sample3();
System.out.println(s3.a);
s3.a=457548;
System.out.println(s3.a);
System.out.println(s3.b);
s3.retest();
}
}
 