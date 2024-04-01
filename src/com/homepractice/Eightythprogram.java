package com.homepractice;
class Insta1
{
	public void pay()
	{
		System.out.println("first pay ");
	}
}
class Insta2 extends Insta1
{
	public void pay()
	{
	System.out.println("second pay");	
	}
}
class Insta3 extends Insta2
{
	public void pay()
	{
		System.out.println("third pay");
	}
}
class Insta4 extends Insta3
{
	public void pay()
	{
		System.out.println("fourth pay");
	}
}
public class Eightythprogram 
{
public static void main(String[] args) 
{
System.out.println("main mmethod started");

Insta4 ref=new Insta4();
ref.pay();


System.out.println("main method ended");
}
}
