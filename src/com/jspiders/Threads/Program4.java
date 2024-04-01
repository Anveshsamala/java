package com.jspiders.Threads;
interface Thread4
{
	void test();
}
public class Program4 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Thread4 ref=()->
{
System.out.println("providing implementation for the test method lamda expression");	
};
ref.test();
System.out.println("main method ended");
}
}
