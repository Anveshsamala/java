package com.Collectionsmodule3;
import java.util.ArrayList;
public class Arraylist1 
{
public static void main(String[] args) 
{
ArrayList a1=new ArrayList();
System.out.println(a1.size());
a1.add("java");
a1.add("testing");
a1.add("preparation ");
a1.add("groming");
a1.add("attaending");
a1.add("interview");
a1.add("interview");
a1.add("interview");
System.out.println(a1.size());
for(int i=0;i<a1.size();i++)
{
	Object ob=a1.get(i);
	System.out.println(ob);
}
}
}
