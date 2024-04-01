package com.oops1;
class Birds
{
	public void sound()
	{
		System.out.println("using birds sound");
	}
}
class Parrot extends Birds
{
	public void sound()
	{
		System.out.println("using Parrot sound");
	}
}
class Crow extends Birds
{
	public void sound()
	{
		System.out.println("using Crow Sound");
	}
}
class Peacock extends Birds
{
	public void sound()
	{
		System.out.println("Using Peacock sound");
	}
}
class Zoo
{
	public void voice(Birds ref)
	{
		ref.sound();
	}
}
public class Runtime2 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Zoo z1=new Zoo();
z1.voice(new Birds());
z1.voice(new Parrot());
z1.voice(new Crow());
z1.voice(new Peacock());

System.out.println("main method ended");
}
}
