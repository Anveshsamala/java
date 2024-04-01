package com.stringsixteenmarch;

public class String4 
{
public static void main(String[] args) 
{
	
String s1="JAVA";                ////using double quotes
System.out.println("s1= "+s1);

String s4=new String();
System.out.println("s4="+s4);    ////zero argument constructor
	
String s2=new String("TESTING"); ////String argument constructor
System.out.println(s2);
	
char [] ar= {'S','Q','L'};       ////Char array argument constructor
String s3=new String(ar);
System.out.println("s3= "+s3);
	
}
}
