package com.module3;

public class Student1 
{
int registrationno;
String name;
double fees;
Student1(int registrationno, String name, double fees)
{
this.registrationno=registrationno;
this.name=name;
this.fees=fees;
}
public String toString()
{
	return "Regno= "+registrationno+"  "+"Name= "+name+"  "+"Fees= "+fees; 
}
}
