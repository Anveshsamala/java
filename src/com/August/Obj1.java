package com.August;
public class Obj1 
{
	double area=360;
	static String appartmentname="Ala vikuntapuramulo";
	String housename="Rahul nilayam";
	boolean hasbalcony=true;
	boolean haspoojaroom=true;
	int noofrooms=200;
	boolean swimmigppool=false;
	String homecolour="blue";
	public static void main(String[] args) 
{
		
	Obj1 ref1=new Obj1();
	Obj1 ref2=new Obj1();
	
	System.out.println(ref1.homecolour);
	System.out.println(ref2.homecolour);
	
	ref1.homecolour="Black";
	System.out.println(ref1.homecolour);
	System.out.println(ref2.homecolour);
	
}
}
