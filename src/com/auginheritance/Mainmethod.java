package com.auginheritance;

public class Mainmethod 
{
public static void main(String[] args) 
{
System.out.println("main method started");

User a=new User();
a.payusing(new Payment());

a.payusing(new Googlepay());

a.payusing(new Phonepe());

a.payusing(new Paytm());

System.out.println("main method ended");
}
}
