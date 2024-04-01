package com.jspiders.dailywise;

import java.util.Comparator;

public class SortonNoofMovies implements Comparator
{


@Override
public int compare(Object o1, Object o2) 
{
	Actor at1=(Actor)o1;
	Actor at2=(Actor)o2;
	return at1.noOfMovies-at2.noOfMovies;
}
}
