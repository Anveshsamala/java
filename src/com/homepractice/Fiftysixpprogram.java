package com.homepractice;
class Zoom8
{
	int b=55;
	boolean d=true;
}
public class Fiftysixpprogram 
{
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	
//	Zoom8 ref=new Zoom8();
//	System.out.println("a= "+ref.b);   reference variable is a non primitive variable which is used to store the address of the object. 
//	ref.b=55;
//	System.out.println("bb= "+ref.b);
	
	System.out.println("b= "+new Zoom8().b);
	System.out.println("d= "+new Zoom8().d);
	new Zoom8().b=457;
	System.out.println("bb= "+new Zoom8().b);
	
	System.out.println("main method ended");
	}
}
