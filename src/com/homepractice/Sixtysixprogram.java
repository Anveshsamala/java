package com.homepractice;
class Recursionn
{
	public  void test(int a)
	{
		if(a<=10)
		{
		System.out.print(a);
		a++;
		test(a);
		}
		
	}
}
public class Sixtysixprogram 
{
public static void main(String[] args) 
{
System.out.println("main mmethod started");

Recursionn ref=new Recursionn();
ref.test(1);

System.out.println("main method ended");
}
}
