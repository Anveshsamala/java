package com.homepractice;

public class Fourtythreeprogram 
{
public static boolean login(String username, int password)
{
	System.out.println("enter data= "+username);
	System.out.println("enter password= "+password);
	if(username=="rahul123@gmail.com"&&password==1234)
	{
	return true;
	}
	else
	{
		return false;
	}
}
public static void perform(boolean r)
{
	if(r==true)
	{
		System.out.println("open home page");
	}
	else
	{
		System.out.println("open error page");
	}
}
	public static void main(String[] args) 
	{
	System.out.println("main method started");	

	boolean b=login("rahul123@gmail.com",1234);
	perform(true);
	System.out.println("b= "+b);
	
	
	System.out.println("main method ended");
	}

}
