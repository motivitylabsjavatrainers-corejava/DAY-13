package com.motivity.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs =new LinkedHashSet<String>();
		lhs.add("satya");
		lhs.add("noor");
		lhs.add(null);
		lhs.add(null);
		lhs.add("venu");
		System.out.println("it will take null values but not take repeated or duplicated values..\n");
		System.err.println("===================================");
		System.out.println(lhs);
		System.err.println("===================================");
		System.out.println("contains method is used to check whether given value is present in set or not ");
		System.out.println(lhs.contains("venu"));
		System.err.println("===================================");
		System.out.println("isEmpty() is used to check hashset is empty or not ");
		System.out.println(lhs.isEmpty());
		System.err.println("===================================");
		System.out.println("clone is use to clone the object values are one object into another object ");
		
		Object lhs2 = lhs.clone();
		System.out.println("this is lhs object : "+lhs);
		System.out.println("this is cloned object : "+lhs2);
		System.err.println("===================================");
		System.out.println("isequl() method use campare the tweo objects.... and containsAll also");
		System.out.println("cloned object and main object is equal : "+lhs.equals(lhs2));
		System.out.println("lhs.containsAll((Collection<String>) lhs2) : "+lhs.containsAll((Collection) lhs2));
		System.err.println("===================================");
		System.out.println("hashcode method returns object number in perticular object");
		System.out.println(lhs.hashCode());
		for (String string : lhs) {
			
		}
		Iterator<String> string = lhs.iterator();
		System.out.println("cursor moves to next element is presnt or not if present it will print the element and "
				+ " cursor move to next element ");
		System.out.println(string.next());
		System.out.println("hasNext method check to next element is present or not....");
		System.out.println(string.hasNext());
		System.out.println("===============================================");
		System.out.println("clear method use to clear the elements from the present set...");
		System.out.println("before clear set :"+lhs);
		lhs.clear();
		System.out.println("after clear the lhs : "+lhs);
		
		
		
		
	}

}

