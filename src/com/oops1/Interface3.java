package com.oops1;
interface Program1
{
	void test();
	void best();
}
class Program2 
{
public void test()
{
	System.out.println("test method implementztion");
}
}
class Program3 extends Program2
{
public void best()
{
	System.out.println("best method implementztion");
}
}
public class Interface3 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Program3 p3=new Program3();
p3.best();
p3.test();
System.out.println("main method ended");
}
}
