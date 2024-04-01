package com.jspiders.dailywise;

public class Program10 
{
public static void main(String[] args) 
{
System.out.println("main method started");

String s1="1234";
System.out.println(s1);
int a=Integer.parseInt(s1);
System.out.println(a);
System.out.println(s1+3);
System.out.println(a+3);

String s2="12.347";
System.out.println(s2);
double b=Double.parseDouble(s2);
System.out.println(b);

String s3="4578925.1425f";
System.out.println(s3);
float t=Float.parseFloat(s3);
System.out.println(t);

System.out.println("main method ended");
}
}
