package com.module3;
public class Array5 
{
public static void main(String[] args) 
{
int [] ar2= {1,2,3,4,5,6};
System.out.println("size"+ar2.length);

for(int i=0;i<ar2.length/2;i++)
{
	int temp=ar2[i];
	ar2[i]=ar2[ar2.length-i-1];
	ar2[ar2.length-i-1]=temp;
	}
for(int i=0;i<ar2.length;i++)
{
System.out.println(ar2[i]);	
}
}
}
