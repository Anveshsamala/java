package com.module3;

public class Stringclass4 
{
public static void main(String[] args) 
{
System.out.println("main method started");
String s1="JAVA";
System.out.println(s1);
String s2=new String("JAVA");
System.out.println(s2);
String s3="JAVA";
System.out.println(s3);
String s4=new String("JAVA");
System.out.println(s4);
System.out.println(s1==s3);///compare ADDRESS OF THE OBJECT
System.out.println(s1==s2);
System.out.println(s2.equals(s4));////compare CONTENT OF THE OBJECT
System.out.println(s2.equals(s3));
System.out.println("main method ended");
}
}
