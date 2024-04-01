package com.oops1;
class Sample1
{
	public void start()
	{
		System.out.println("using start method");
	}
}
class Sample2 extends Sample1
{
	public void Start(int a)
	{
		System.out.println(a);
		System.out.println("using Start11 method");
	}
}
class Sample3 extends Sample2
{
	public void Start(double b)
	{
		System.out.println(b);
		System.out.println("using Start111 method");
	}
}
public class Methodoversubclass 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Sample3 s3=new Sample3();
s3.start();
s3.Start(123456);
s3.Start(147.258);

System.out.println("main method ended");
}
}
