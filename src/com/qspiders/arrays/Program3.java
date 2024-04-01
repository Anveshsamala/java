package com.qspiders.arrays;

public class Program3 
{
	
public static void main(String[] args) 
{
System.out.println("main method started");
int [] ar3={3,2,10,6,4};
int sum=0;
System.out.println("size="+ar3.length);
for(int i=0;i<ar3.length;i++)
{
	System.out.println(ar3[i]);
	sum=sum+ar3[i];
}
System.out.println("sum=" +sum);
System.out.println("main method ended");
}
}
