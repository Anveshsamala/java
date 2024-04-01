package com.homepractice;
class Zoom9
{
	int a=10;
	public void temp()
	{
		System.out.println("non static temp method");
	}
}
public class Sixtyfourprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Zoom9 ref=new Zoom9();
System.out.println(ref.a);

ref.a=55;
Zoom9 ref1=ref;
System.out.println(ref1.a);

Zoom9 ref2=ref1;
System.out.println(ref2.a);

Zoom9 ref3=ref2;
System.out.println(ref3.a);

System.out.println("main method ended");
}
}
