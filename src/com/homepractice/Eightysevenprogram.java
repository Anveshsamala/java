package com.homepractice;
class Zoom20
{
	public void whatsapp()
	{
		System.out.println("only for mmessages");
	}
}
class Zoom21 extends Zoom20
{
	public void whatsapp()
	{
	System.out.println("mmessges and audio call");	
	}
}
class Zoom22 extends Zoom21
{
	public void whatsapp()
	{
		System.out.println("messages audio calls and video calls");
	}
}
class Zoom23 extends Zoom22
{
	public void whatsapp()
	{
		System.out.println("messages audio calls video calls and status ");
	}
}
public class Eightysevenprogram 
{

	public static void main(String[] args) 
	{ 
		System.out.println("main method started");
		
		Zoom23 ref=new Zoom23();
		ref.whatsapp();
		
		System.out.println("main method ended");
	}
}
