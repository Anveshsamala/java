package com.stringsixteenmarch;

public class String7 
{
public static void main(String[] args) 
{
StringBuilder s1=new StringBuilder("TESTING");
System.out.println(s1);

s1.append("JAVA");
System.out.println(s1);

s1.reverse();
System.out.println(s1);

StringBuffer sf=new StringBuffer("TESTING");
System.out.println(sf);

System.out.println(sf.hashCode());

System.out.println(s1.hashCode());

}
}
