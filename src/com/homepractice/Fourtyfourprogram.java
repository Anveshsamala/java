package com.homepractice;

public class Fourtyfourprogram 
{
public static boolean test(int a, int b)
{
	if(a%10==7&&b%10==7)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	boolean res=test(47,57);
	System.out.println("result= "+res);
	
	boolean res1=test(43,54);
	System.out.println("result1= "+res1);
	System.out.println("main method ended");

	}

}
