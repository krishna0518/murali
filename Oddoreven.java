package com.test;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number :");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		/*if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
*/
		
		if((num/2)*2==num)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
