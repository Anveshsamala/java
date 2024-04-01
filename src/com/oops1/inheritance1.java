package com.oops1;
class Interviewday1
{
	public void aptitude()
	{
	System.out.println("first round is aptitude");	
	}
}
class Interviewday2 extends Interviewday1
{
	public void programing()
	{
	System.out.println("second round is programing");	
	}
}
class Interviewday3 extends Interviewday2
{
	public void tech()
	{
	System.out.println("third round is technical");	
	}
}
class Interviewday4 extends Interviewday3
{
	public void hr()
	{
		System.out.println("fourth round is hr");
	}
}
public class inheritance1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Interviewday2 i2=new Interviewday4();

i2.aptitude();

i2.programing();

if(i2 instanceof Interviewday3)
{
	
Interviewday3 i3=(Interviewday3)i2;

i3.tech();
i3.aptitude();
i3.programing();

}

System.out.println("main method ended");
}
}
