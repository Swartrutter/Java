package cn.dgut.jsny.six;

import java.util.Scanner;

public class change {
	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ӳ�����������Ŀn��");
		int n = sc.nextInt();// ���û��������벻ͬ����Ӳ��������������
		int coins[] = new int[10];
		System.out.println("������Ӳ�������ֵ");
		for (int i = 0; i < n; i++)
			coins[i] = sc.nextInt();// ���û������������ֵ
		System.out.print("�������ܽ��amount:");
		int amount = sc.nextInt();// ���û����������ܽ��
		while (amount > 0) {
			amount = moneychange(amount, coins, n);
			flag++; // ��Ǯһ�κ��־������1
		}
		System.out.println("�ճ��ܽ����������Ӳ������Ϊ��" + flag);
		sc.close();// Ϊ�˰�ȫ������ر�sc
	}
	
	public static int moneychange(int amount, int coins[], int n) { // ����һ����������
		for (int i = n - 1; i > 0 && amount >= 0; i--) { // �ж�����Ϊ�ܽ�����0����������δѭ�����
			if (coins[i] <= amount) {
				amount = amount - coins[i]; // �����������ȥ�ܽ��
			}
		}
		return amount; // ���ظ��º���ܽ��
	}
}