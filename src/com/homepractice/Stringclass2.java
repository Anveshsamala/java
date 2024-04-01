package com.homepractice;

public class Stringclass2 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		String s1="java is important";//double quotes
		
		String s2=new String();		  //new operator//zero argument constructor
		String s3=new String("ravali");//String argument constructor
		char[] ch= {'S','Q','L'};
		String s4=new String(ch);//character array argument constructor
		
		
		System.out.println("main method ended");
	}
}
