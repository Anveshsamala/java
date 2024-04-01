package com.homepractice;

public class tweleprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");
int age=12;
System.out.println("age= "+age);

if(age>=20&&age<35)
{
	System.out.println("marriage age");
}
else if(age>0&&age<10)
{
	System.out.println("child age");
}
else if(age>=10&&age<20)
{
	System.out.println("teen age");
}
else if(age>=35&&age<60)
{
	System.out.println("babies age");
}
else if(age>=60)
{
	System.out.println("seniour citigen age");
}
System.out.println("main method ended");
}
}
