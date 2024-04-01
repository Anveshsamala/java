package com.auginheritance;

public class Program5 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Program4 ref4=new Program4();
ref4.end1(new Program1());
ref4.end1(new Program2());
ref4.end1(new Program3());

//ref4.end2(new Program1());
ref4.end2(new Program2());
ref4.end2(new Program3());

//ref4.end3(new Program1());
//ref4.end3(new Program2());
ref4.end3(new Program3());

System.out.println("main method ended");
}
}
