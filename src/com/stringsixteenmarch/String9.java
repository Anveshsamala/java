package com.stringsixteenmarch;

public class String9 
{
	
public static void main(String[] args) 
{
String s1="ANVESH";
System.out.println("s1= "+s1);
if(s1.length()>1)
{
	char [] ch=s1.toCharArray();
	System.out.println("ch= "+ch);
	
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		
	
	String out=new String(ch);
	System.out.println("out= "+out);
}
else
{
System.out.println("s1= "+s1);	
}
}
}
