package com.qspiders.practice;

public class Program7 
{
public static void main(String[] args)
{
System.out.println("main method started");
Student [] ar=new Student[5];
Student s1=new Student(7,"james bond",5);
ar[0]=s1;
ar[1]=new Student(420, "khaidi",4);
ar[2]=new Student(421, "khaidi2",3);
ar[3]=new Student(422, "khaidi3",2);
ar[4]=new Student(423, "khaidi4",1);
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
System.out.println("main method ended");
}
}
