package com.homepractice;
class Zoom24
{
	public void ara()
	{
		System.out.println("anvesh rahul");
	}
}
class Zoom25 extends Zoom24
{
	public void ara1()
	{
		System.out.println("rahul anvesh");
	}
}
class Zoom26 extends Zoom25
{
	public void ara2()
	{
		System.out.println("raju rahul");
	}
}
class Zoom27 extends Zoom26
{
	public void ara3()
	{
		System.out.println("raju anvesh");
	}
}
class Zoom28 extends Zoom27
{
	public void ara4()
	{
		System.out.println("anvesh raju");
	}
}
public class Eightynineprogram 
{
	public static void main(String[] args) 
	{
		System.out.println("main ethod started");
		
		Zoom28 ref=new Zoom28();
		ref.ara();
		ref.ara1();
		ref.ara2();
		ref.ara3();
		ref.ara4();
		
		System.out.println("main method ended");
	}
}
