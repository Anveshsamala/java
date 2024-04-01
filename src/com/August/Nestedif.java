package com.August;
public class Nestedif 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int storedpin=3456;
int enteredpin=3456;
if(storedpin==enteredpin)
{
	System.out.println("entered pin is correct and success");
	double amountinbank=5000;
	double withdrawalamt=1000;
	if(amountinbank>=withdrawalamt)
	{
		System.out.println("withdrawal amount successfull");
	}
	else
	{
		System.out.println("cann't wothdrawal amount");
	}
}
else
{
	System.out.println("entered pin is not correct and unsuccess");
}

System.out.println("main method ended");
}
}
