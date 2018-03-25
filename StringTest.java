package com.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="ABA";
		
		char c[] = s1.toCharArray(); 
		
		int len = s1.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				
				
				System.out.print(c[j]);
			}
			System.out.println();
		}
		

	}

}
