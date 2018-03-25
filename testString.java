package com.test;


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
	
	public class testString {

	    static String acidNaming(String acid_name) {
	        // Complete this function
	        
	        //int len =acid_name.length();
	        
	        char[] str =acid_name.toCharArray();
	        
	        char[] hydro = {'h','y','d','r','o'}; 
	        char[] ic = {'i','c'};
	        
	        int len =str.length;
	        
	        if(len>6)
	        {
	        	if(str[0]==hydro[0] &&str[1]==hydro[1] &&str[2]==hydro[2] &&str[3]==hydro[3] &&str[4]==hydro[4] &&str[len-2]==ic[0] &&str[len-1]==ic[1])
	        	{
	        		return "non-metal acid";
	        	}
	        }
	        if(len>2)
	        {
	        	if(str[len-2]==ic[0] &&str[len-1]==ic[1])
	        	{
	        		return "polyatomic acid";
	        	}
	        	
	        }
	        return "not an acid";
	        
	   }
	        
	        
	        /*if(len>0)
	        {
	                String start_val=acid_name.substring(0,5);
	                String end_val=acid_name.substring(len-2);
	                String hydro="hydro";
	                String ic="ic";

	                if(len > 6 && start_val.equals(hydro) && end_val.equals(ic))
	                {
	                    return "non-metal acid";
	                }
	                else if(len > 2 && end_val.equals(ic))
	                {
	                    return "polyatomic acid";
	                }
	                else 
	                {
	                    return "not an acid";
	                }
	         }
	        else
	        {
	            return "not an acid";
	        }*/

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int a0 = 0; a0 < n; a0++){
	            String acid_name = in.next();
	            String result = acidNaming(acid_name);
	            System.out.println(result);
	        }
	        in.close();
	    }


}

	
	/* int len =acid_name.length();
     if(len>0)
     {
             String start_val=acid_name.substring(0,5);
             String end_val=acid_name.substring(len-2);
             String hydro="hydro";
             String ic="ic";

             if(len > 6 && start_val.equals(hydro) && end_val.equals(ic))
             {
                 return "non-metal acid";
             }
             else if(len > 2 && end_val.equals(ic))
             {
                 return "polyatomic acid";
             }
             else 
             {
                 return "not an acid";
             }
      }
     else
     {
         return "not an acid";
     }*/