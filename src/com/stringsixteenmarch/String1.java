package com.stringsixteenmarch;

public class String1 {

	public static void main(String[] args) 
	{
	String s1="TESTING";
	System.out.println(s1);
	
	int s2=s1.length();
	System.out.println(s2);
	
	char ch=s1.charAt(5);
	System.out.println(ch);
	
	char [] ch1=s1.toCharArray();
	System.out.println(ch1);
	
	String s3=s1.toLowerCase();
	System.out.println(s3);
	
	String s4="IndePenDance";
	System.out.println(s4);
	
	String s5=s4.toUpperCase();
	System.out.println(s5);
	
	String s6=s1.substring(2);
	System.out.println(s6);
	
	String s7=s4.substring(3, 7);
	System.out.println(s7);
	}

}
