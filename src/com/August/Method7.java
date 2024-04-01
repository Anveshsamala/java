package com.August;
public class Method7 
{
	public static boolean login(String username, int psd)
	{
		if(username=="anveshsamala5949@gmail.com"&&psd==1234)
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
			System.out.println("home page displayed");
		}
		else
		{
			System.out.println("error page displayed");
		}
	}
public static void main(String[] args) 
{
System.out.println("main method started");

boolean res=login("anveshsamala5949@gmail.com", 1234);
perform(res);

System.out.println("mainmethod ended");
}
}
