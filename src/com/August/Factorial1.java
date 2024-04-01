package com.August;

public class Factorial1 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int num=5;
int out=1;
System.out.println(num);

for(int i=num;num>1;num--)
{
	out=out*num;
}
System.out.println(out);

System.out.println("main method ended");
}
}
