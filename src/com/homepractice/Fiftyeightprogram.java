package com.homepractice;
class Biscuit
{
	static String brand="Good day";
	public static void energy()
	{
		System.out.println("estatic energy method");
	}
}
public class Fiftyeightprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

System.out.println("energy= "+Biscuit.brand);
Biscuit.energy();

System.out.println("main method ended");
}
}
