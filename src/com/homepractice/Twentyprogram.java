package com.homepractice;
public class Twentyprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");
int count=0;
for(int i=1;i<=50;i++)
{
	if(i%3==0)
	{
		count++;
	}
}
System.out.println("count= "+count);
System.out.println("main method ended");
}
}
