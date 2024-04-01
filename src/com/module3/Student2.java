package com.module3;

public class Student2 
{
public static void main(String[] args) 
{
Student1 [] ar1=new Student1[6];
Student1 s1=new Student1(147,"ANVESH",10000);
ar1[0]=s1;
ar1[1]=new Student1(258,"CHANDU",147852);
ar1[2]=new Student1(369,"NARESH",159758);
ar1[3]=new Student1(159,"SRIKANTH",35789);
ar1[4]=new Student1(357,"SARDAR",145782);
ar1[5]=new Student1(961,"RAHUL",364579);
for(int i=0;i<ar1.length;i++)
{
System.out.println(ar1[i]);	
}
}
}
