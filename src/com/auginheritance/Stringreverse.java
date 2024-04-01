package com.auginheritance;

public class Stringreverse 
{
public static void main(String[] args) 
{
String s1="Testingjava";
System.out.println(s1);

char [] ch=s1.toCharArray();

for(int i=0;i<ch.length/2;i++)
{
	char temp=ch[i];
	ch[i]=ch[ch.length-1-i];
	ch[ch.length-1-i]=temp;
}
String s2=new String(ch);
System.out.println(s2);
}
}
