package cn.dgut.jsny.six;

import java.util.Scanner;

public class chu3max {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("����������nums����n��");
		int n = sc.nextInt();// ���û����������������
		int nums[] = new int[10];
		System.out.println("����������nums�и�����ֵ");
		for (int i = 0; i < n; i++)
			nums[i] = sc.nextInt();// ���û��������������ֵ

		sc.close();
	}
}
