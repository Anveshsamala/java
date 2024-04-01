package com.oops1;
class Firstyear
{
	public void commonSubjects()
	{
		System.out.println("clear all first year common subjects");
	}
}
class secondyear extends Firstyear
{
	public void powerSystems1() 
	{
		System.out.println("clear all second year power System subjects");
	}
}
class Thirdyear extends secondyear
{
	public void machines2() 
	{
		System.out.println("clear all third year Machines subjects");
	}
}
class Finalyear extends Thirdyear
{
	public void factsSubjects()
	{
		System.out.println("clear all final year subjects");
	}
}
public class Interface2 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Firstyear f4=new Finalyear();

f4.commonSubjects();

if(f4 instanceof Thirdyear)
{
	Thirdyear t3=(Thirdyear)f4;
t3.commonSubjects();
t3.machines2();
t3.powerSystems1();

}
System.out.println("main method ended");
}
}
