package com.homepractice;

import java.util.ArrayList;

public class Arraylist2 
{
public static void main(String[] args) 
{
System.out.println("main method started");

ArrayList al=new ArrayList();

al.add(new Mobile1(15545, "mi", 12655));
al.add(new Car1(4, "Wolkswaganour vento", 800000));
al.add(new Student3(125,"Anvesh",50000));

al.add(new Mobile1(458, "Samsung", 45682));
al.add(new Car1(4, "Hundai", 1000000));
al.add(new Student3(98,"Rahul",90000));

al.add(new Mobile1(7656, "Vivo", 425478));
al.add(new Car1(4, "Innova crista", 2000000));
al.add(new Student3(01,"Raju",100000));

for(int i=0;i<al.size();i++)
{
	Object ob=al.get(i);
	System.out.println(ob);
}

System.out.println("main method ended");
}
}
