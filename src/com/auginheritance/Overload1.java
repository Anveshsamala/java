package com.auginheritance;

public class Overload1 
{
public void login(int a,String s1)
{
	System.out.println("using mobile number login");
}
public void login(String s2, String s3)
{
	System.out.println("using String login");
}
public static void main(String[] args) 
{
System.out.println("main method started");

Overload1 ref=new Overload1();
ref.login(849909, "Rahul123@");
ref.login("anveshsamala5949@gmail.com", "Rahul123@");

System.out.println("main method ended");
}
}
