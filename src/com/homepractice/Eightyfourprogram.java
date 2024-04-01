package com.homepractice;

public class Eightyfourprogram 
{
	public void search()
	{
		System.out.println("zero search");
	}
	public void search(int a)
	{
		System.out.println("int nummber search");
	}
	public void search(double d)
	{
		System.out.println("mobile number search");
	}
	public void search(String s1)
	{
		System.out.println("username search");
	}
	public static void main(String[] args) 
	{
	System.out.println("main method started");	

	Eightyfourprogram ref=new Eightyfourprogram();
	ref.search();
	ref.search(143);
	ref.search(8499099085.1);
	ref.search("SAMALA RAHUL RAJU ANVESH SRINIVAS SWAPNA ILAMMA");
	System.out.println("main method ended");
	}

}
