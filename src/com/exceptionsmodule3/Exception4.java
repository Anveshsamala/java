package com.exceptionsmodule3;
class First
{
public void Studytesting()
{
	//int a=1/0;
	System.out.println("testing ");
}
}
class Second
{
public void Studyjava()
{
	First f1=new First();
	f1.Studytesting();
			
	System.out.println("java ");
}
}
class Third
{
public void Studyapti()
{
	Second s2=new Second();
	s2.Studyjava();
	System.out.println("apti ");
}
}
class Fourth
{
public void Studyselenium()
{
	Third t3=new Third();
	t3.Studyapti();
	System.out.println("selenium ");
}
}
public class Exception4 
{

public static void main(String[] args) 
{
System.out.println("main method started");
Fourth f4=new Fourth();
try
{
f4.Studyselenium();
}
catch(ArithmeticException ref)
{
	System.out.println("Arithmetic exception");
}
System.out.println("main method ended");
}
}
