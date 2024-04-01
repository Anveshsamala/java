package com.module3;

public class Stringclass3 
{
public static void main(String[] args) 
{
System.out.println("main method started");
String s1="a";
System.out.println(s1);
System.out.println(s1.hashCode());
String s2=new String("a");
System.out.println(s2);
System.out.println(s2.hashCode());
System.out.println(s1==s2);                ////compares the ADDRESS o the object
System.out.println(s1.equals(s2));         ///compares the CONTENT off the object
System.out.println("main method ended");
}
}
