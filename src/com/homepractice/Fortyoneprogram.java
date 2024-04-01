package com.homepractice;

public class Fortyoneprogram 
{
public static void start(int a, int b)
{
	System.out.println("enter a= "+a);
	System.out.println("enter b= "+b);
	System.out.println("sum= "+(a+b));
}
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	start(20,30);
	
	search("Facebook.com");
	
	search1("Rahul123@gmail.com",123456);
	
	search2(25,1.5f,true,"SAMALA ANVESH");
	
	System.out.println("main method ended");

	}
	public static void search(String data)
	{
		System.out.println("enter search data= "+data);
		
	}
	public static void search1(String data, int pass)
	{
		System.out.println("enter username= "+data);
		System.out.println("enter ppassword= "+pass);
	}
	public static void search2(int a, float b, boolean c, String s1)
	{
		System.out.println("enter a= "+a);
		System.out.println("enter b= "+b);
		System.out.println("enter c= "+c);
		System.out.println("enter s1= "+s1);
	}

}
