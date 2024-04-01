package com.jspiders.Threads;
class Thread3 implements Runnable
{

	@Override
	public void run() {
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
public class Program3 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Thread3 td1=new Thread3();
Thread ref=new Thread(td1);
ref.start();
Thread3 td2=new Thread3();
Thread ref1=new Thread(td2);
ref1.start();
System.out.println("mainmethod ended");
}
}
