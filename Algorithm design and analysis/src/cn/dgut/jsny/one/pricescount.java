package cn.dgut.jsny.one;

import java.util.Scanner;

public class pricescount {
	public static void main(String[] args) {
		System.out.println("�1�7�1�7�1�7�1�7�1�7�1�7�0�3�1�7�1�7�0�7�1�7�1�7�0�7�1�7�1�7�1�7�1�7�0�3�1�7�1�7�0�9�1�7�1�7");
		int[] prices = new int[10];
		int[] result = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0 ; i < count ; i++)
			prices[i] = sc.nextInt();
		for (int i = 0 ; i < count ; i++) {
			if (prices[i] < prices[i+1])
				result[i] = prices[i];
			else
				result[i] = prices[i] - prices[i+1];
		}
		System.out.print("[");
		for(int i = 0 ; i < count ; i++)
			System.out.print(result[i] + ",");
		System.out.print("]");
		sc.close();
	}
}
