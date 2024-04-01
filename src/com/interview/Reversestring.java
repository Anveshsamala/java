package com.interview;

public class Reversestring 
{
public static void main(String[] args) 
{
System.out.println("main method started");
String s1="TESTINGJAVA";
char [] ch=s1.toCharArray();
System.out.println(ch);
for(int i = 0; i < ch.length/2; i++) 
{
int temp=ch[i];
ch[i]=ch[ch.length-1-i];
ch[ch.length-1-i]=(char) temp;
}
String aa=new String(ch);
System.out.println(aa);
System.out.println("main method ended");
}
}
