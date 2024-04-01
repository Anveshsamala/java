package com.qspiders.collections;
import java.util.LinkedList;
public class Program4 
{
public static void main(String[] args) 
{
System.out.println("main method started");
LinkedList ll=new LinkedList();
ll.add(new Student11(98, "RAHUL", 63.5));
ll.add(new Laptop11(26000, "LENOVO", 5));
ll.add(new Mobile11(5,"One Plus 6T",36000));
ll.add(new Student11(12, "Raju", 95.4));
ll.add(new Laptop11(35000, "DELL", 4));
ll.add(new Mobile11(4,"Apple I phone",64000));
ll.add(null);
ll.add("Selenium");
for(int i=0;i<ll.size();i++)
{
Object ob=ll.get(i);
if(ob instanceof Student11)
	{
	Student11 st=(Student11)ob;
	System.out.println(st.rollno);
	System.out.println(st.name);
	System.out.println(st.percentage);
	}
	else if(ob instanceof Laptop11)
	{
		Laptop11 lt=(Laptop11)ob;
		System.out.println(lt.cost);
		System.out.println(lt.brand);
		System.out.println(lt.star);
	}
		else if(ob instanceof Mobile11)
		{
			Mobile11 ml=(Mobile11)ob;
			System.out.println(ml.quality);
			System.out.println(ml.brand);
			System.out.println(ml.rate);
		}
}

System.out.println("main  method ended");
}
}
	