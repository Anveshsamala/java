package com.Collectionsmodule3;

import java.util.ArrayList;

public class Arraylist3 
{
public static void main(String[] args) 
{
System.out.println("main method started");
ArrayList ar=new ArrayList();
ar.add(new Program1(1235,"nileema",150));
ar.add(new Program2(10,"Raptor",55000));
ar.add(new Program2(22,"Airjet",12000));
ar.add(new Byke1(123,"Royal Enfield",150000));
ar.add(new Byke1(456,"Bullet",220000));
for(int i=0;i<ar.size();i++)
{
	Object ob=ar.get(i);
	System.out.println(ob);
}

System.out.println("main method ended");
}
}
