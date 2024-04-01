package com.homepractice;
class Numbers
{
	public static void rest(int a)
	{
		if(a>1)
		{
	System.out.print( a);
	a--;
	rest(a);
		}
	
	}
	public static void reste(int b)
	{
		if(b<=10)
		{
		System.out.print(b);
		b++;
		reste(b);
		}
	}
}
public class Sixtysevenprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Numbers.rest(10);
Numbers.reste(1);


}
}
