package com.Collectionsmodule3;

import java.util.LinkedList;

public class Linkedlist1
{
public static void main(String[] args)
{
System.out.println("main method started");

LinkedList ls=new LinkedList();
ls.add(new Sample1(489,"agvbdgd",14254654));
ls.add(new Sample1(257,"ertdfg",14785));
ls.add(new Sample1(753,"idbdgdh",72545));
ls.add(new Sample2(2,"lenovo",147859));
ls.add(new Sample2(6,"hp",475896));
ls.add(new Sample2(7,"dell",65000));

for(int i=0;i<ls.size();i++)
{
	Object ob=ls.get(i);
	System.out.println(ob);
}
System.out.println("main method ended");
}
}
