package com.homepractice;

public class Dotequals1 
{
	int number;
	String name;
Dotequals1(int number, String name)
{
	this.number=number;
	this.name=name;
}
@Override
public boolean equals(Object ob)
{
	Dotequals1 dt=(Dotequals1)ob;
	return this.number==dt.number;
}
@Override
public String toString()
{
	return "name="+name;
}
@Override
public int hashCode()
{
	return 786;
}

public static void main(String[] args) 
{
System.out.println("main method started");
Dotequals1 de1=new Dotequals1(20, "ANVESH");
Dotequals1 de2=new Dotequals1(20, "ANVESH");
System.out.println(de1==de2);
System.out.println(de1.equals(de2));
System.out.println("main method ended");
}
}
