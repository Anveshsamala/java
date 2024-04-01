package com.jspiders.Threads;
interface Thread5
{
	void end();
	static void call() 
	{
		System.out.println("static concrete call method");
	}
	default void videocall() 
	{
	System.out.println("default concrete videocall method");	
	}
}
public class Program5 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Thread5 ref1=()->
{
	System.out.println("providing implementation in end method using lamda expression");
};
ref1.end();
Thread5.call();
ref1.videocall();

System.out.println("main method ended");
}
}
