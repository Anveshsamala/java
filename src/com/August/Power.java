package com.August;

public class Power 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int num=5;
int pow=3;
if(pow>0)
{
	num=num*pow;
	pow--;
}
System.out.println(num);

System.out.println("main method ended");
}
}
