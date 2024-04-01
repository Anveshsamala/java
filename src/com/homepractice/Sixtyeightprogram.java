package com.homepractice;
class Factorial
{
	public static void fact(int a)
	{
		if(a>1)
		{
		int out=1;	;
	System.out.println(a);
	a--;
	out=out*a;
	fact(a);
		}
	}
}
public class Sixtyeightprogram 
{
public static void main(String[] args) 
{
Factorial.fact(7);	
}
}
