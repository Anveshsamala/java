package com.jspiders.dailywise;

import java.util.ArrayList;

public class Program11 
{
public static void main(String[] args) 
{
System.out.println("main method started");

ArrayList al=new ArrayList();

al.add(45);
al.add(12.25);
al.add(1478956325);
al.add(2.5f);
al.add("ANVESH");
al.add(false);
al.add(true);
al.add('a');

for(Object ob:al)
{
	System.out.println(ob);
}

System.out.println("main method ended");
}
}
