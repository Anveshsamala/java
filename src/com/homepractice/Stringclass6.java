package com.homepractice;

public class Stringclass6 
{
public static void main(String[] args) 
{
System.out.println("main method started");

String s1="java";
System.out.println("s1="+s1);

String s2=new String("java");
System.out.println("s2="+s2);

String s3="java";
System.out.println("s3="+s3);

String s4=new String("java");
System.out.println("s4="+s4);

System.out.println(s1==s2);        //false
System.out.println(s3.equals(s4));   //true

System.out.println(s1==s3);        //true
System.out.println(s2.equals(s4));   //true

System.out.println("main method ended");
}
}
