package com.jspiders.dailywise;

import java.util.Comparator;

public class SortbasedonSalary implements Comparator
{


@Override
public int compare(Object o1, Object o2) 
{
	Actor at1=(Actor)o1;
	Actor at2=(Actor)o2;
	return (int) (at1.salary-at2.salary);
}
}

