package com.homepractice;

public class Fiftynineprogram 
{
	int a=10;
	String s1="abcd";
	double d=1245878.1457;
	public void test()
	{
		System.out.println("non static test method");
	}
public static void main(String[] args) 
{
System.out.println("main method started");

System.out.println("a= "+new Fiftynineprogram().a);
System.out.println("s1= "+new Fiftynineprogram().s1);
System.out.println("d= "+new Fiftynineprogram().d);
new Fiftynineprogram().test();

System.out.println("main ethod ended");
}
}
