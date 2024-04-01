package com.jspiders.Threads;
class Thread2 extends Thread
{
	@Override
	public void run()
	{
	for(int i=5;i>=1;i--)
	{
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}
}
public class Program2 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Thread2 td=new Thread2();
td.start();
Thread2 td1=new Thread2();
td1.start();

System.out.println("main method ended");
}
}
