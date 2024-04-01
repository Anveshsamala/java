package com.August;

public class Dividenumberwithoutdivisionoperator 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int num=20;
int devidenum=5;
int nooftimes=0;
System.out.println(num);
//for(int i=devidenum;)
while(num>=5)
{
	num=num-devidenum;
	nooftimes++;
}
System.out.println("number of times= " +nooftimes);
System.out.println("main method ended");
}
}
