package com.homepractice;
class Whatsapp1
{
	public void firstversion()
	{
		System.out.println("message mmethod");
	}
}
class Whatsapp2 extends Whatsapp1
{
	public void seceondversion()
	{
		System.out.println("audio call method");
	}
}
class Whatsapp3 extends Whatsapp2
{
	public void thirdversion()
	{
		System.out.println("video call method");
	}
}
public class Seventysevenprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Whatsapp3 ref=new Whatsapp3();
ref.firstversion();
ref.seceondversion();
ref.thirdversion();

System.out.println("main ethod ended");
}
}
