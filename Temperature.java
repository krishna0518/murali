package com.test;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the temperature in fehrenheit :");
		Scanner scan = new Scanner(System.in);
		
		float temp_in_feh = scan.nextFloat();
		
		float temp_in_cel = ((temp_in_feh -32)*5)/9;
		
		System.out.println("temp in celsius :"+temp_in_cel);

	}

}
