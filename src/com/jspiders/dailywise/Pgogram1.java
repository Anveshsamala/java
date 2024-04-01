package com.jspiders.dailywise;
import java.util.HashSet;
public class Pgogram1 
{
public static void main(String[] args) 
{
System.out.println("main method started");
HashSet hs=new HashSet();
hs.add("d");
hs.add("b");
hs.add("d");
hs.add("c");
hs.add("A");
hs.add("a");


for(Object ob:hs)
{
	System.out.println(ob);
}
System.out.println(hs.size());
System.out.println("main method ended");
}
}
