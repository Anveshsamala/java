package com.auginheritance;

public class B 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Paymethod re=new Paymethod();
re.payment();


Poatm ref=new Poatm();
ref.payment();
ref.poatmm();                      //////////Multiple inheritance
                                     ////////multiple sub classes aquiring the properties from one super class
Paygoogle ref1=new Paygoogle();
ref1.payment();
ref1.googlpay();

Phonepay ref2=new Phonepay();
ref2.payment();
ref2.payphone();

System.out.println("min method ended");
}
}
