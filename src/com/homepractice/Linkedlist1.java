package com.homepractice;

import java.util.LinkedList;

public class Linkedlist1 
{
public static void main(String[] args) 
{
System.out.println("main method started");

LinkedList ll=new LinkedList();

ll.add(new Mobile1(156,"gdjdgd",42654));
ll.add(new Car1(14,"hgfehe",858));
ll.add(new Student3(425,"fdndgh",725));

ll.add(new Mobile1(854,"dgvd",4));
ll.add(new Car1(45,"ghdbd",825));
ll.add(new Student3(25,"hdbd",55));

ll.add(new Mobile1(1425,"hdbd",525));
ll.add(new Car1(7,"ndndb",336));
ll.add(new Student3(5,"mdn",66));

ll.add(new Mobile1(65,"bdbnd",55));
ll.add(new Car1(6,"bdebd",846));
ll.add(new Student3(552,"bdjd",65));

for(int i=0;i<ll.size();i++)
{
	Object ob=ll.get(i);
	System.out.println(ob);
}

System.out.println("main method ended");
}
}
