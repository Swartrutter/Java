package cn.dgut.jsny.six;

import java.util.Scanner;

public class change {
	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入硬币面额种类数目n：");
		int n = sc.nextInt();// 从用户键盘输入不同面额的硬币数组个数组个数
		int coins[] = new int[10];
		System.out.println("请输入硬币面额数值");
		for (int i = 0; i < n; i++)
			coins[i] = sc.nextInt();// 从用户键盘输入面额值
		System.out.print("请输入总金额amount:");
		int amount = sc.nextInt();// 从用户键盘输入总金额
		while (amount > 0) {
			amount = moneychange(amount, coins, n);
			flag++; // 揍钱一次后标志变量加1
		}
		System.out.println("凑成总金额所需最少硬币数量为：" + flag);
		sc.close();// 为了安全起见，关闭sc
	}
	
	public static int moneychange(int amount, int coins[], int n) { // 建立一个方法揍金额
		for (int i = n - 1; i > 0 && amount >= 0; i--) { // 判断条件为总金额大于0且数组数量未循环完毕
			if (coins[i] <= amount) {
				amount = amount - coins[i]; // 符合条件后减去总金额
			}
		}
		return amount; // 返回更新后的总金额
	}
}