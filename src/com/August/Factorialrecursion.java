package com.August;

public class Factorialrecursion 
{
	
public static void recur(int num, int out)
{
   	if(num>1)
   	{
   		out=out*num;
   		System.out.println(out);
   		num--;
   		recur(num,out);
   		
   	}
   	
}
public static void main(String[] args)
{
System.out.println("main method started");

recur(7,1);


System.out.println("main method ended");
}
}
