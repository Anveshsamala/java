package com.homepractice;
class Building
{
	int noofpillers=18;
	String nameofbuilding="srinivasa nilayam";
	public void staying()
	{
		System.out.println("non static staying method");
	}
}
public class Sixtythprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Building ref=new Building();
System.out.println("no of pillers= "+ref.noofpillers);
System.out.println("name of the building= "+ref.nameofbuilding);
ref.staying();

System.out.println("main method ended");
}
}
