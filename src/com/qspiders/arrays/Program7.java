package com.qspiders.arrays;

public class Program7
{
public static void main(String[] args)
{
System.out.println("main method started");
Student [] ar=new Student[5];
Student s1=new Student(7,"james bond",5);
ar[0]=s1;
ar[1]=new Student(420,"khaidi1",4);
ar[2]=new Student(110,"khaidi2",4.4);
ar[3]=new Student(220,"khaidi3",3.5);
ar[4]=new Student(330,"khaidi4",3.0);
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
System.out.println("main method ended");
}
}
