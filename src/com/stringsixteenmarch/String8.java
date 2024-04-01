package com.stringsixteenmarch;

public class String8 {

	public static void main(String[] args) 
	{
		String s1="TESTING";
		System.out.println("s1="+s1);
		
		char [] ar=s1.toCharArray();
		System.out.println("ar"+ar);
		
		int a=s1.charAt(4);
		System.out.println("a="+a);
		
		
		
		for(int i=0;i<ar.length/2;i++)
		{
		int	temp=ar[i];
		ar[i]=ar[ar.length-1-i];
		ar[ar.length-1-i]=(char) temp;
			
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
		}
	}

}
