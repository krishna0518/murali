package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Testhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "murali");
		map.put(5, "murali");
		map.put(3, "murali");
		map.put(4, "murali");
		map.put(2, "murali");
		map.put(null,null);
		map.put(6, "ram");
		map.put(null, "krish");
		
		Set set = map.entrySet();
		
		for (Object s : set)
		
		{
			System.out.println(s);
		}
		for(Entry<Integer, String> h : map.entrySet())
		{
			System.out.println(h.getKey()+"::"+h.getValue());
			String s = h.getValue()+"0123";
			
		}
		
		for (Integer key : map.keySet()) {
		    // ...
			
			System.out.println(key);
		}
		
		for (String value : map.values()) {
		    // ...
			System.out.println(value);
		}
		
		

	}

}
