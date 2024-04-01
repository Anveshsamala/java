package com.homepractice;

public class Stringclass5 
{
public static void main(String[] args) 
{
System.out.println("main method started");
String s1="java is important";
System.out.println("s1="+s1);
String s2=new String("java is important");
System.out.println("s2="+s2);

System.out.println("double equals operator= "+s1==s2);

System.out.println("dotequals method= "+s1.equals(s2));

System.out.println("main method ended");
}
}
