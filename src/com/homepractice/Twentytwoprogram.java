package com.homepractice;

public class Twentytwoprogram 
{
public static void main(String[] args) 
{
System.out.println("main method started");
int count=0;
for(char ch=65;ch<=90;ch++)
{
	count++;
	System.out.println("ch= "+ch);
}
System.out.println("count= "+count);
//int count1=0;
for(char ch='a';ch<='z';ch++)
{
	count++;
	System.out.println("ch= "+ch);
}
System.out.println("count1= "+count);
System.out.println("main method ended");
}
}
