package com.homepractice;

public class Stringclass8 
{
public static void main(String[] args) 
{
System.out.println("main method ended");

StringBuffer sb=new StringBuffer("java");
System.out.println("sb="+sb);

sb.append("testing");
System.out.println("sb="+sb);

sb.reverse();
System.out.println(sb);
StringBuilder sl=new StringBuilder("s");
System.out.println(sl);

sl.append("h");
System.out.println(sl);

sl.reverse();
System.out.println(sl);

System.out.println("main method ended");
}
}
