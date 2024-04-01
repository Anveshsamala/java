package com.oops1;

import com.oops2.Accessprotective1;

public class Accessprotective3 extends Accessprotective1
{
public static void main(String[] args) 
{
System.out.println("main method started");
Accessprotective3 ref=new Accessprotective3();
ref.test();
System.out.println("a="+ref.a);
System.out.println("main method ended");
}
}
