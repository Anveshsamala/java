package com.interview;

public class Polindrome 
{
public static void main(String[] args) 
{
System.out.println("main method started");
String s1="RADaR";
char [] ch=s1.toCharArray();

int count=0;

for (int j = 0; j < ch.length/2; j++) 
{
if(ch[j]!=ch[ch.length-1-j])
{
	count++;
	break;
}
}
if(count==0)
{
	System.out.println("polindrome");
}
else
{
	System.out.println("not a polindrome");
}

System.out.println("main method ended");
}
}
