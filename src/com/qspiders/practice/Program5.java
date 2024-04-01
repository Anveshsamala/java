package com.qspiders.practice;

public class Program5 
{
public static void main(String[] args) 
{
System.out.println("main method started");
int [] ar= {1,2,3,4,5,6};
int sum=0;
for(int i=0;i<ar.length;i++)
{
	
	sum=sum+ar[i];
	
}
System.out.println(sum);
System.out.println("main method ended");
}
}
