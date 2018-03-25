package com.test;

import java.util.ArrayList;

public class Testarraylist {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.addAll(al);
		all.add(6);
		all.add(7);
		all.add(8);
		all.add(9);
		
		System.out.println(all);
		System.out.println(all.size());
		al.trimToSize();
		System.out.println(al.size());
		
		for(Integer alll :all )
		{
			System.out.println(alll);
		}
		
	}

}
