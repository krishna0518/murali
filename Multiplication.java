package com.test;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number :");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		for(int i =1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+i*num);
		}
	}

}
