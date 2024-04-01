package com.homepractice;

public class Thirtyfourprogram {

	public static void main(String[] args) 
	{
	System.out.println("main method started");
	
	int num=20;
	System.out.println("number= "+num);
	int divide=5;
	System.out.println("divide the number with= "+divide);
	int count=0;
	while(num>=divide)
	{
		num=num-divide;
		count++;
	}
	System.out.println("count= "+count);
	System.out.println("main method ended");
	}

}
