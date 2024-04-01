package com.homepractice;

public class Student2 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
	
	Student1 [] ar=new Student1[5];
	
	Student1 s1=new Student1(98, "RAHUL", 4.5);
	ar[0]=s1;
	ar[1]=new Student1(99,"jagan",2.5);
	ar[2]=new Student1(100,"raju",8.5);
	ar[3]=new Student1(101,"janardhan",6.5);
	ar[4]=new Student1(102,"ramesh",3.5);
	
	for(int i=0;i<ar.length;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("main method ended");
}
}
