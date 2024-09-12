package com.test;

import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input v1 : ");
		String version1 = sc.nextLine();
		System.out.print("Input v2 : ");
		String version2 = sc.nextLine();
		
		if(version2.length() < 500) {
			int result = compareVersionNumber(version1.length(), version2.length(),
					version1, version2);
			System.out.print("output : "+ result);
		}else {
			System.out.print("Out of range number");
		}
		
	}
	
	private static int compareVersionNumber(int v1, int v2, String version1, String version2) {

		for (int i = 0, j = 0; i < v1 || j < v2; ++i, ++j) {
			int a = 0;
			int b = 0;

			while (i < v1 && version1.charAt(i) != '.') {
				a = a * 10 + (version1.charAt(i++) - '0');
			}
			while (j < v2 && version2.charAt(j) != '.') {
				b = b * 10 + (version2.charAt(j++) - '0');
			}

			if (a != b) {
				if (a > b) {
					return 1;
				} else if (a < b) {
					return -1;
				}
			}
		}
		return 0;

	}

}
