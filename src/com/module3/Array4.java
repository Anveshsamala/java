package com.module3;

public class Array4 
{
public static void main(String[] args) 
{
int [] ar1= {3,2,10,6,4};
System.out.println(ar1.length);
int sum=0;
for(int i=0;i<ar1.length;i++)
{
	sum=sum+ar1[i]; 
	
}
System.out.println("sum="+sum);
}
}
