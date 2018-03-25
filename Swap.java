package com.test;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter two numbers :");
		System.out.println("num1:");
		Scanner scan = new Scanner(System.in);
		
		int num1=scan.nextInt();
		System.out.println("num2:");
		int num2=scan.nextInt();
		
		num1=num1+num2;
		num2 = num1-num2;
		num1=num1-num2;
		
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);

	}

}
