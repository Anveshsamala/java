package com.module3;
class Sample2
{
	@Override
public int hashCode()
{
	return 150;
}
}
public class Hashcode1 
{
public static void main(String[] args)
{
System.out.println("main method started");
Sample2 ref=new Sample2();
int ref1=ref.hashCode();
System.out.println(ref1);
System.out.println("main method ended");
}
}
