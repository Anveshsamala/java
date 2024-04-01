package com.interview;

public class Program1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
String s2="RADAR";
char [] ch=s2.toCharArray();
int count=0;
for (int i = 0; i < ch.length/2; i++) 
{

if(ch[i]!=ch[ch.length-1-i])
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
	System.out.println("its not a polindrome");
}

System.out.println("mainmethod ended");
}
}
