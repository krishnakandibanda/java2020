package com.method;

import java.util.Scanner;

public class MethodExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any Value");
		int input=sc.nextInt();
		findEvenOdd(input);
		
	}
	public static void findEvenOdd(int num) {
		if(num%2==0) {
			System.out.println(num+" is Even ");
		}
		else {
			System.out.println(num+" is Odd");
		}
	}
	
}

