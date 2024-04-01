package com.qspiders.practice;

public class Program1 
{
public static void main(String[] args)
{
System.out.println("main method started");
String s1="programing";
System.out.println("s1="+s1);

int size=s1.length();    //length():int
System.out.println("size="+size);

char ch=s1.charAt(2);             ////charAt(inta):char
System.out.println("ch="+ch);

String s2="qsPiders";
System.out.println("s2="+s2);
s2=s2.toUpperCase();                //toUpperCase():String
System.out.println("s2="+s2);

String s3="JSPIDERS";
System.out.println("s3="+s3);
s3=s3.toLowerCase();               //toLowerCase():String
System.out.println("s3="+s3);

String s4="anveshrahul";
System.out.println("s4="+s4);
s4=s4.substring(2);               //substring(startindex):String
System.out.println("s4="+s4);

String s5="RahulAnvesh";
System.out.println("s5="+s5);
s5=s5.substring(2, 6);          //substring(startindex,endindex):String
System.out.println("s5="+s5);

System.out.println("main method ended");
}
}
