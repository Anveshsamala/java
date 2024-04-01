package com.August;

public class Method3 
{
	public static void loginpage(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
public static void registration(String username, char gender, long phonenumber, String mailid, int age, double percent)
{
	System.out.println(username);
	System.out.println(gender);
	System.out.println(phonenumber);
	System.out.println(mailid);
	System.out.println(age);
	System.out.println(percent);
	
	//System.out.println(username,gender,phonenumber,mailid,age,percent);
}
public static void main(String[] args) 
{
System.out.println("main method started");

registration("Anvesh", 'm', 8499099085l, "anveshsamala5949@gmail.com", 25, 63.4);

loginpage("SAMALA ANVESH","Rahul123@");

System.out.println("main method ended");
}
}
