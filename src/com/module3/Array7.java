package com.module3;
public class Array7 
{
	public static void main(String[] args) 
	{
	Array6 [] ar=new Array6[5];
	Array6 s1=new Array6(123, "SAMSUNG", 15000);
	ar[0]=s1;
	ar[1]=new Array6(234,"MI",12000);
	ar[2]=new Array6(345,"VIVO",14500);
	ar[3]=new Array6(567,"MOTROLA",22000);
	ar[4]=new Array6(678,"NOKIA",11000);
	for(int i=0;i<ar.length;i++)
	{
	System.out.println(ar[i]);	
	}

	}
	}

