package com.qspiders.arrays;

import java.util.HashSet;

public class Program10 
{
public static void main(String[] args) 
{
System.out.println("main method started ");
HashSet hs=new HashSet();
Mobile m1=new Mobile(123, "MI", 76);
Mobile m2=new Mobile(123, "MI", 76);

/*System.out.println(m1.hashCode());
System.out.println(m2.hashCode());
System.out.println(m1.hashCode()==m2.hashCode());
System.out.println(m2.equals(m1));*/

hs.add(m1);
hs.add(m2);
System.out.println(hs.size());
for(Object ob:hs)
{
	System.out.println(ob);
}
System.out.println("main method ended");
}
}
