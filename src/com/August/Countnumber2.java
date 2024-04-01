package com.August;

public class Countnumber2 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int num=2020555;
int count=0;
System.out.println(num);

while(num!=0)
{
	num=num/10;
	count++;
}
System.out.println(count);

System.out.println("main method ended");
}
}
