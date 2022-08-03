package com.motivity.collection;

import java.util.HashSet;

public class Hashsetpractice {

	
	public static void main(String[] args)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//add method is used to add the elements into the set
		hs.add(10);
		hs.add(11);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		hs.add(16);
		hs.add(null);
		hs.add(30);
		System.out.println(hs);
		System.out.println("added by using add() method.....");
		System.out.println("=================================\n");
		HashSet<Integer> hs1 =new HashSet<Integer>();
		hs1.add(32);
		hs1.add(78);
		//clone method is used to copy or shadow of an anothe set object
		 hs1 =(HashSet<Integer>) hs.clone();
		System.out.println(hs1);
		System.out.println("cloned to h1 object into h2 object...");
		System.err.println("=================================\n");
		//Remove an element
		hs1.remove(15);
		System.out.println("after remove an element 15 by using remove() method ");
		System.out.println(hs1);
		System.err.println("=================================\n");
		System.out.println("isEmpty() is used to check hashset is empty or not ");
		System.out.println("hs1 hashset is empty : "+hs1.isEmpty());
		System.err.println("=================================\n");
		System.out.println("size() is used to check the size of an defined set");
		System.out.println("size of an hashset : "+hs1.size());
		System.err.println("=================================\n");
		System.out.println("contains() method is used to given value is present or not ");
		System.out.println(hs1.contains(12));
		System.err.println("=================================\n");
		System.out.println("containsAll(object e) is used check elements is present  one set elements to another set elements");
		System.out.println(hs.containsAll(hs1));
		System.err.println("=================================\n");
		System.out.println("removeAll() method is used to one set elmenets are removed from another set");
		System.out.println("before remove elements : "+hs);
		hs.removeAll(hs1);
		System.out.println("after remove elements "+hs);
		System.err.println("=================================\n");
		System.out.println("clear() method is used to clear all elements in presnt set..");
		hs.clear();
		System.out.println("After clear method : "+hs);
		System.err.println("=================================\n");
		System.out.println("getClass() method is returns class of referennce object ");
		System.out.println(hs1.getClass());
		System.err.println("===================================\n");
		System.out.println("toArray() method is copy the values into an array object ");
		Object[] arr = hs1.toArray();
		System.out.println(hs1);
		for (Object object : arr) 
		{
			System.out.println(object);
			
		}
	}

}
