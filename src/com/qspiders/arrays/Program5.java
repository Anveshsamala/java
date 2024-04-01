package com.qspiders.arrays;

public class Program5
{
	public static void main(String[] args) 
	{
	System.out.println("main method started");
	int [] ar4= {3,2,10,6,4};
	int temp=1;
	for(int i=0;i>ar4.length;i++) 
	{
		ar4[0]=temp;
		temp=ar4[4];
		ar4[1]=temp;
		temp=ar4[3];
	System.out.println(ar4[i]);	
	}
	System.out.println("main method ended");
	}
}
