package com.auginheritance;

public class User1 
{
public static void main(String[] args) 
{
System.out.println("main method started");

Bankaccount ref=Bankmanager.creataccount(1234, "ANVESH", 10000, 'h');
ref.checkbal();
ref.deposit(5000);
ref.checkbal();
ref.withdraw(2000);
ref.checkbal();


System.out.println("main method ended");
}
}
