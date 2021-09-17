package cn.dgut.jsny.six;

import java.util.Scanner;

public class chu3max {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入数组nums个数n：");
		int n = sc.nextInt();// 从用户键盘输入数组个数
		int nums[] = new int[10];
		System.out.println("请输入数组nums中各个数值");
		for (int i = 0; i < n; i++)
			nums[i] = sc.nextInt();// 从用户键盘输入各个数值

		sc.close();
	}
}
