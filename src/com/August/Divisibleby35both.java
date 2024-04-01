package com.August;

public class Divisibleby35both 
{
public static void main(String[] args) 
{
System.out.println("main method stared");

int n=17;
System.out.println(n);

if(n%5==0&&n%3==0)
{
	System.out.println("number divisible by both 5 and 3");
}
else if(n%5==0)
{
	System.out.println("number divisible by 5 only");
}
else if(n%3==0)
{
	System.out.println("number divisible  by 3 only");
}
else
{
	System.out.println("number not divisible by number");
}

System.out.println("mainmethod ended");
}
}
