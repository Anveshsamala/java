package com.jspiders.dailywise;

import java.util.TreeSet;

public class Program6 
{
public static void main(String[] args)
{
System.out.println("main method started");
Actor at1=new Actor("balayya", 103,5555.5);
Actor at2=new Actor("prabhas", 26,100.5);
Actor at3=new Actor("sampoo", 4,0.5);
Actor at4=new Actor("pawan", 25,3000.5);
Actor at5=new Actor("mahesh babu", 47,4355.5);
Actor at6=new Actor("arjun", 19,234.5);
Actor at7=new Actor("ram", 13,23.5);
Actor at8=new Actor("mahesh babu", 47,4355.5);

TreeSet ts1=new TreeSet();
ts1.add(at1);
ts1.add(at2);
ts1.add(at3);
ts1.add(at4);
ts1.add(at5);
ts1.add(at6);
ts1.add(at7);
ts1.add(at8);
System.out.println("outputs of first");
for(Object ob:ts1)
{
	System.out.println(ob);
}

TreeSet ts2=new TreeSet(new SortonNoofMovies());
ts2.add(at1);
ts2.add(at2);
ts2.add(at3);
ts2.add(at4);
ts2.add(at5);
ts2.add(at6);
ts2.add(at7);
ts2.add(at8);
System.out.println("outputs of second");
for(Object ob:ts2)
{
	System.out.println(ob);
}
TreeSet ts3=new TreeSet();
ts3.add(at1);
ts3.add(at2);
ts3.add(at3);
ts3.add(at4);
ts3.add(at5);
ts3.add(at6);
ts3.add(at7);
ts3.add(at8);
System.out.println("outputs of third");
for(Object ob:ts3)
{
	System.out.println(ob);
}
System.out.println("main method ended");
}
}
