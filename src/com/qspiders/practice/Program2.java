package com.qspiders.practice;

public class Program2 
{
public static void main(String[] args) 
{
System.out.println("main method started");
StringBuffer sb=new StringBuffer("java");
System.out.println("sb="+sb);
sb=sb.append("Testing");
System.out.println("sb1="+sb);
sb=sb.reverse();
System.out.println("sb2="+sb);
StringBuilder sf=new StringBuilder("a");
System.out.println("sf="+sf);                         //Override
System.out.println("sf.hascode="+sf.hashCode());      // hashcode cannot not be Override
System.out.println("main method ended");
}
}
