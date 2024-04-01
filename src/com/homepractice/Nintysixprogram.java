package com.homepractice;
class Demo6
{
	int a=89;
}
class Demo7 extends Demo6
{
	public void start()
	{
		System.out.println("start method");
	}
	public void end()
	{
		System.out.println("end method");
	}
}
class Demo8 extends Demo7
{
	double b=143.1458;
}
public class Nintysixprogram 
{
	public static void main(String[] args) 
	{
		System.out.println("main mmethod started");
		
		Demo6 d6=new Demo7();
		System.out.println("a= "+d6.a);
		
		if(d6 instanceof Demo7)
		{
		Demo7 d7=(Demo7)d6;
		//System.out.println("b= "+d7.b);
		d7.start();
		d7.end();
		}
		else
		{
			System.out.println("properties missing");
		}
		
		System.out.println("main method ended");
	}
}
