package com.test;

	
	/* IMPORTANT: Multiple classes and nested static classes are supported */

	/*
	 * uncomment this if you want to read input.
	//imports for BufferedReader
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	//import for Scanner and other utility classes
	import java.util.*;
	*/

	// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

	import java.util.*;
	public class test {
	    public static void main(String args[] ) throws Exception {

	        //Scanner
	       // Scanner s = new Scanner(System.in);
	        //System.out.println("Input :");
	        int input = 16;// Reading input from STDIN
	        //System.out.println(input);
	        
	        if(input<0 ||input>1000000006)
	        {
	        System.out.println("out of range");
	        }
	        else
	        {
	        	//System.out.println("hi");
	            for(int i=1;i<1000000007;i++)
	            {
	                int sum=1;
	                int n=i;
	                while(n!=0)
	                {
	                	//System.out.println("hi123"+i);
	                    sum = sum*(n%10);
	                    n=n/10;
	                    //System.out.println("end while:"+sum);
	                }
	                
	                if(sum%1000000007==input)
	                {
	                	//System.out.println("hello");
	                   System.out.println(i);
	                   break;
	                }
	                //System.out.println("hello");
	            }
	            
	            //System.out.println("heel");
	        }
	        
	        

	    }
	}


