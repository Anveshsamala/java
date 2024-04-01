package com.auginheritance;

public class Narrowidening 
{
public static void main(String[] args) 
{
System.out.println("main method started");

int a=(int)65.55; /////////narrowing:=assigning higher data type value to the lower data type variable ,its explicitly done by programmer
System.out.println("a= "+a);

double d=4;   //////widening:- assigning lower data type value to the higher data type variable its implicitly done by programmer
System.out.println("d= "+d);

System.out.println("main method ended");
}
}
