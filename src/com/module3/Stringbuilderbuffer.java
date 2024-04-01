package com.module3;

public class Stringbuilderbuffer 
{
public static void main(String[] args) 
{
	//String s1="lava";
	//String s2=s1+" fafa";
	//System.out.println(s2);
StringBuilder sb=new StringBuilder("JAVA");
System.out.println("sb="+sb);
sb.append("TESTING");
System.out.println("sb1="+sb);
sb.reverse();
System.out.println("sb2="+sb);
StringBuffer sf=new StringBuffer("a");
System.out.println("sf="+sf);
System.out.println(sf.hashCode());   ///cannot override
}
}
