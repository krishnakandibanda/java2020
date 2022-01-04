package com.array.exam;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any number");
		number = sc.nextInt();
		isPrime(number);
	}
	public static void isPrime(int input) {
		int count=0;
		for(int i=1;i<=input;i++) {
			if(input%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(+input+" is A Prime Number");
		}
		else {
			System.out.println(+input+" is Not A Prime Number");
		}	
	}	
}
