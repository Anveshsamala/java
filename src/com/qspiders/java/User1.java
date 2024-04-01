package com.qspiders.java;

public class User1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
Mobile m1=new Mobile(500, "1k images", 1000);
System.out.println("Contacts="+m1.getContacts());
m1.getContacts();
System.out.println("Galary="+m1.getGalary());
m1.getGalary();
System.out.println("Messages="+m1.getMessages());
m1.getMessages();
m1.setContacts(2000);
m1.setgalary("2k images");
m1.setMessages(5000);
System.out.println("Contacts="+m1.getContacts());
m1.getContacts();
System.out.println("Galary="+m1.getGalary());
m1.getGalary();
System.out.println("Messages="+m1.getMessages());
m1.getMessages();
System.out.println("main method ended");
}
}
