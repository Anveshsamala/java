package com.homepractice;

public class Eightyfiveprogram 
{
	public void facebook(String s1, long l)
	{
		System.out.println("mailid and password");
	}
	public void facebook(long a,long b)
	{
		System.out.println("phone nummber and password");
	}
	public void facebook(String s2,String s3)
	{
		System.out.println("mailid and name password");
	}
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	
	Eightyfiveprogram ref=new Eightyfiveprogram();
	ref.facebook("samalaanvesh@gmail.com", 8499099085l);
	ref.facebook(8499099085l, 8499099085l);
	ref.facebook("samalarahul123@gmail.com", "Anvesh123@");
	
	
	System.out.println("main method ended");

	}

}
