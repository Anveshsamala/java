package com.module3;
public class Stringletteroccurance 
{
public static void main(String[] args) 
{
	String s1="india";
	System.out.println(s1);
	char [] ch=s1.toCharArray();
	int len=ch.length;
	for(int i=0;i<len;i++)
	{
		char ch1=s1.charAt(i);
		int count=0;
		for(int j=0;j<len;j++)
		{
			if(ch1==ch[j])
			{
			count++;
			System.out.println(ch[i]);
			}
		}
		if(count>0)
		{
			System.out.println("count="+count);
		}
	}
}
}
