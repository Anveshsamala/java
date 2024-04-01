package com.qspiders.java;

public class Program12 
{
public static void main(String[] args) 
{
String s1="a";
System.out.println("s1="+s1);
System.out.println("s1.hashcode="+s1.hashCode());
String s2=new String("a");
System.out.println("s2="+s2);
System.out.println("s1.hashcode="+s1.hashCode());
System.out.println(s1==s2);   //address of the object
System.out.println(s1.equals(s2));    //content of object
}
}
