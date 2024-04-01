package com.Collectionsmodule3;

import java.util.HashSet;

public class Hashset1 
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
hs.add("B");
hs.add("C");
hs.add("D");
hs.add("E");
for(Object ob:hs)
{
	System.out.println(ob);
}
System.out.println("main method ended");
}
}
