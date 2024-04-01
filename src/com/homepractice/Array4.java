package com.homepractice;

public class Array4 
{
public static void main(String[] args) 
{
System.out.println("main method started");
int [] ar= {3,2,10,6,4};
System.out.println(ar.length);
int sum=0;
for(int i=0;i<ar.length;i++)
{
	sum=sum+ar[i];
}
System.out.println(sum);
System.out.println("main method ended");
}

}
