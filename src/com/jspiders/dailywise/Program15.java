package com.jspiders.dailywise;
class Friend1
{
public void studytesting()
{
	System.out.println("testing...");
	int a=1/0;////riskey line
}
}
class Friend2
{
public void studyjava()
{
	System.out.println("java...");
	Friend1 f1=new Friend1();
	f1.studytesting();
}
}
class Friend3
{
public void studyapti()
{
	System.out.println("apti...");
	Friend2 f2=new Friend2();
	f2.studyjava();
}

}
public class Program15 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Friend3 f3=new Friend3();
try
{
f3.studyapti();
}
catch(ArithmeticException ref)
{
	System.out.println("Arithmatic exception");
}
System.out.println("main method ended");
}
}
