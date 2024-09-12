package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Input array prices
		int[] prices = achieveTransaction(sc);
		if (prices != null) {
			System.out.println(Arrays.toString(prices));

			System.out.print("buy day : ");
			int buyday = sc.nextInt();
			System.out.print("sell day : ");
			int sellday = sc.nextInt();

			// check valid day
			if (buyday < sellday) {
				if (sellday <= prices.length) {
//				System.out.println("Valid day");	

					int pricebuy = prices[buyday - 1];
					int pricesell = prices[sellday - 1];

					int maxIndex = 0;

					for (int i = 0; i < prices.length; i++) {
						maxIndex = prices[i] > prices[maxIndex] ? i : maxIndex;
					}

					// Check your Profit
					int profit = checkProfit(pricebuy, pricesell);

					System.out.println("Your profit = " + profit);

					if (maxIndex > buyday) {
						int pricerecommend = prices[maxIndex];
						int recprofit = checkProfit(pricebuy, pricerecommend);
						int bestdaySell = maxIndex + 1;
						System.out.print("Best profit = " + recprofit + " If you sell on day " + bestdaySell);
					} else {

					}

				} else {
					System.out.println("Invaild sell day");
				}
			} else {
				System.out.println("Invalid day, You must buy before sell");
			}
		}
	}

	private static int checkProfit(int pricebuy, int pricesell) {

		if (pricesell > pricebuy) {
			int profit = pricesell - pricebuy;
			return profit;
		} else {
			return 0;
		}

	}

	private static int[] achieveTransaction(Scanner sc) {

		System.out.print("Choose all day : ");
		int day = sc.nextInt();
		// Check correct day
		if (day <= 1) {
			System.out.print("Invalid day");
			return null;
		} else {
			int[] prices = new int[day];

			for (int i = 0; i < prices.length; i++) {
				System.out.println("Please input price : ");
				prices[i] = sc.nextInt();
			}
			return prices;
		}

	}

}
