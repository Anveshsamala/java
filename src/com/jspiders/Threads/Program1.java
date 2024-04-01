package com.jspiders.Threads;
class Thread1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
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
public class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Thread1 th=new Thread1();
		th.start();
		Thread1 th1=new Thread1();
		th1.start();
		
		System.out.println("main method ended");
	}

}
