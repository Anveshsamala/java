package com.stringsixteenmarch;

public class String6 
{
public static void main(String[] args) 
{
String s1="java";
System.out.println("s1="+s1);

String s2=new String("java");
System.out.println("s2="+s2);

String s3="java";
System.out.println("s3="+s3);

String s4=new String("java");
System.out.println("s4="+s4);

System.out.println(s1==s3);///double equals operator
System.out.println(s1.equals(s3));/////dot equals operator

System.out.println(s2==s4);
System.out.println(s2.equals(s4));
}
}
