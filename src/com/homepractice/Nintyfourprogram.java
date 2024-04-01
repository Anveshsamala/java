package com.homepractice;
class Example1
{
	public void end1(PProgram1 p1)
	{
		p1.test();
//		p1.disp();
//		p1.start();
	}
	public void end2(PProgram2 p2)
	{
		p2.test();
		p2.disp();
		p2.start();
	}
	public void end3(PProgram3 p3)
	{
		System.out.println("a= "+p3.a);
		System.out.println("b= "+p3.b);
		p3.test();
		p3.disp();
		p3.start();
	}
}
public class Nintyfourprogram 
{
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	
	Example1 ref=new Example1();
	ref.end1(new PProgram1());
	ref.end1(new PProgram2());
	ref.end1(new PProgram3());
	
	ref.end2(new PProgram2());
	ref.end2(new PProgram3());
	
	ref.end3(new PProgram3());
	
	System.out.println("mmain mmethod ended");
	}

}
