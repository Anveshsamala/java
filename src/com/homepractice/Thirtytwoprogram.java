package com.homepractice;
public class Thirtytwoprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int num=568;
int count=0;
while(num!=0)
{
	num=num/10;
	count++;
}
System.out.println("count= "+count);
System.out.println("main method ended");
}
}
