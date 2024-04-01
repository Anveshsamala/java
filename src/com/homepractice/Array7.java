package com.homepractice;

public class Array7 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int [] ar= {10,20,30,40,50,60};
System.out.println("length= "+ar.length);

//for(int i=0;i<ar.length/2;i++)
//{
//	int temp=ar[i];
//	ar[i]=ar[ar.length-1-i];
//	ar[ar.length-1-i]=temp;
//}
for(int i=0;i<ar.length/2;i++)
{
	int temp=ar[0];
	ar[0]=ar[ar.length-1];
	ar[ar.length-1]=temp;
}
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}

System.out.println("main method ended");
}
}
