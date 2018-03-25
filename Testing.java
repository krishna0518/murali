package com.test;

import java.util.HashSet;

public class Testing {
	
	public static void main(String[] args) {
		Person p = new Person(1,"murali",21);
		Person p1 = new Person(1,"murali",21);
		Person p2 = new Person(1,"murali",21);
		
		HashSet<Person> set = new HashSet<>();
		
		set.add(p);
		set.add(p1);
		
		set.add(p2);
		
		set.add(p);
		
		for(Person per : set)
		{
			System.out.println(per);
		}
		
		System.out.println(set.size());
		
		
		
	}

}
