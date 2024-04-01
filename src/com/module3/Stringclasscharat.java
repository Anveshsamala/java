package com.module3;

public class Stringclasscharat 
{
public static void main(String[] args) 
{
	String s1="INDEPENDANCE";
	System.out.println(s1);
	int size=s1.length();/////lengthmethod
	System.out.println(size);
	
	char ch=s1.charAt(3);   ////charat(index) method 
	System.out.println(ch);
	
	char [] ch1=s1.toCharArray();/////tochararray() method
	System.out.println(ch1);
	System.out.println(ch1[0]);
	System.out.println(ch1[1]);
	System.out.println(ch1[2]);
	System.out.println(ch1[3]);
	System.out.println(ch1[4]);
	System.out.println(ch1[5]);
	System.out.println(ch1[6]);
	System.out.println(ch1[7]);
	System.out.println(ch1[8]);
	System.out.println(ch1[9]);
	System.out.println(ch1[10]);
	System.out.println(ch1[11]);
	
	String ab="ANVESH";
	String s2=ab.toLowerCase();/////tolowercase method
	System.out.println(s2);
	
	String bc="rahulraju";
	String s3=bc.toUpperCase();  /////touppercase method
	System.out.println(s3);
	
	String cd="QSPIDERS";
	String s4=cd.substring(3);////subString(index1)
	System.out.println(s4);
	
	String de="JSPIDERSS";
	String s5=de.substring(2, 5);////substring(index1,index2)
	System.out.println(s5);
	
	
}
}
