package com.qspiders.testing;

public class Program14 
{
public static void main(String[] args) 
{
	
String s1="Programming";
System.out.println("s1="+s1);
int a=s1.length();
System.out.println("s1=" +a);

//int size=s1.length();              /////length();int
//System.out.println("size="+size);

char ch=s1.charAt(6);                 //////charAt(int a);char

System.out.println("ch="+ch);

//char ch2=s1.charAt(16);
//System.out.println("ch2="+ch2);

String s2="tEsTinG";
System.out.println(s2);
s2=s2.toUpperCase();
System.out.println("s2="+s2);   /////toUpperCase();String

String s3="anVEShRAHULraju";
System.out.println(s3);
s3=s3.toLowerCase();
System.out.println("s3="+s3);/////toLowerCase();String

String s4="QSPIDERS";
System.out.println(s4);
s4=s4.substring(3);
System.out.println("s4="+s4);////////substring(int start);String

String s5="SRIVENKATESHWARA";
System.out.println(s5);
s5=s5.substring(5, 9);
System.out.println("s5="+s5);    /////substring(int start,int end);String

System.out.println("s1=" +s1.length());

}
}
