package cn.dgut.jsny.five;

import java.util.Random;
import java.util.Scanner;

public class rand7torand10 {
	public static void main(String[] args) {
		System.out.println("输入调用rand10（）的次数n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 从用户键盘得到调用次数n
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			int rand10 = rand10();
			System.out.print(rand10 + ","); // 调用rand10()方法输出函数
		}
		System.out.println("]");
		sc.close(); // 确保安全，关闭sc
	}

	public static int rand7() { // 已有方法rand7()
		Random r = new Random(); // 创建一个新的随机数生成器
		int rand = r.nextInt();
		int rand7 = rand > 0 ? rand : -rand; // 判断生成的随机数rand7并转换为正整数
		return (rand7 % 7 + 1); // 返回模7加1后的int型整数
	}

	public static int rand10() { // 写一个方法rand10()
		int rand7 = rand7();
		return (rand7 + 3);
	}
}