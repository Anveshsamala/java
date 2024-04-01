package com.interview;
public class Program3 
{
public static void main(String[] args) 
{
System.out.println("main method started");
String s1="ab";
char [] ch=s1.toCharArray();
System.out.println(s1);
if(s1.length()>1)
{
	
int temp=ch[0];
ch[0]=ch[ch.length-1];
ch[ch.length-1]=(char) temp;
String oo=new String(ch);
System.out.println(oo);
}
else
{
	System.out.println(s1);
}

System.out.println("main method ended");
}
}
