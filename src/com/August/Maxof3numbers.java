package com.August;

public class Maxof3numbers 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int a=5522;
int b=76142;
int c=798;
System.out.println(a);
System.out.println(b);
System.out.println(c);

if(a>b&&a>c)
{
	System.out.println("a is bigger");
}
else if(b>c)
{
	System.out.println("b is bigger");
}
else
{
	System.out.println("c is bigger");
}

System.out.println("main method ended");
}
}
