package com.test;

import java.math.BigInteger;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int min = 1;
		int max = 45;
		System.out.print("input : ");
		int n = sc.nextInt();
		
		if(min <= n ) {
			if(n <= max) {
				
				int result = climbSteps(n);
				System.out.println("Result = " + result + " ways");
				
			}else {
				System.out.println("Out of range number");
			}
		}else {
			System.out.println("Out of range number");
		}
		
	
	}
	
	private static int climbSteps(int n) {
		int a = 0;
		int b = 1;
		
		for(int i = 0; i< n; ++i) {
//			System.out.println("a = "+ a);
//			System.out.println("b = "+ b);
			int c = b + a;
			a = b;
			b = c;
		}
		
		return b;
	}

}
