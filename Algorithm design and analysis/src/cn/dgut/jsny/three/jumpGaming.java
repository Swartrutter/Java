package cn.dgut.jsny.three;

import java.util.Scanner;

public class jumpGaming {
	public static void main(String[] args) {
		int[] a = new int[10];
		int n;// 初始化数组和数组个数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要判断数组的元素个数：");
		n = sc.nextInt();
		System.out.println("请依次输入数组元素：");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();// 分别从用户键盘中输入数组总个数和数组中各元素的值
		System.out.println("判断结果（true表示可以达到最后位置，false表示不能达到最后位置）");
		int count = 0;// 定义一个计数器计算前几位元素能达到的最大位置
		int flag = 0;// 定义一个标志数值
		for (int i = 0; i < n; i++) {
			if ((flag + a[i]) >= i + 1) {
				count++;// 前几位元素之和大于位置数总和,能达到最大位数，计数器+1
			} else {
				break;
			}
		}
		if (count >= n)
			count = n;
		int laji = 0;
		for (int i = 0; i < count; i++) {// 开始判断数组中的元素能否跳跃到最后一个位置
			if (a[i] >= count - 1 - i) {
				System.out.println("true");
				break;
			} else {
				laji++;
			}
		}
		if (laji >= count)
			System.out.println("false");

	}
}