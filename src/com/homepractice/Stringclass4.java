package com.homepractice;

public class Stringclass4 
{
public static void main(String[] args) 
{
String s1="java";//using double quotes
System.out.println("s1="+s1);
String s2=new String();//using new operator//zero argument constructor
System.out.println("s2="+s2);
String s3=new String("testing");//String argument constructor
System.out.println("s3="+s3);
char [] ch= {'S','Q','L'};
String s4=new String(ch);//character array argument constructor
System.out.println("s4="+s4);
}
}
