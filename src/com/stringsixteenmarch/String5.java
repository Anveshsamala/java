package com.stringsixteenmarch;

public class String5 
{
public static void main(String[] args) 
{
String s1="java";
System.out.println("s1= "+s1);

String s2=new String("java");
System.out.println("s2= "+s2);

System.out.println(s1==s2);       ////double equals operator
System.out.println(s1.equals(s2));////dot equals operator

}
}
