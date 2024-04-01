package com.module3;

public class Array9 
{
	public static void main(String[] args) 
	{
		Array8 [] ar=new Array8[5];
		Array8 s1=new Array8(147,"benz",1540000);
		ar[0]=s1;
		ar[1]=new Array8(8064,"audi",12000);
		ar[2]=new Array8(5949,"wolkswaganour",1200000);
		ar[3]=new Array8(1805,"honda",800000);
		ar[4]=new Array8(4492,"alto",500000);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
