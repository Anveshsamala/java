package com.homepractice;

public class Array5 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int [] ar= {1,2,3,4,5,6};
System.out.println("length="+ar.length);

for(int i=0;i<ar.length/2;i++)
{
	int temp=ar[i];
	ar[i]=ar[ar.length-1-i];
	ar[ar.length-1-i]=temp;
}
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
System.out.println("main method ended");
}
}
