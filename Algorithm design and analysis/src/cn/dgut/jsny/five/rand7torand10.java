package cn.dgut.jsny.five;

import java.util.Random;
import java.util.Scanner;

public class rand7torand10 {
	public static void main(String[] args) {
		System.out.println("�������rand10�����Ĵ���n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ���û����̵õ����ô���n
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			int rand10 = rand10();
			System.out.print(rand10 + ","); // ����rand10()�����������
		}
		System.out.println("]");
		sc.close(); // ȷ����ȫ���ر�sc
	}

	public static int rand7() { // ���з���rand7()
		Random r = new Random(); // ����һ���µ������������
		int rand = r.nextInt();
		int rand7 = rand > 0 ? rand : -rand; // �ж����ɵ������rand7��ת��Ϊ������
		return (rand7 % 7 + 1); // ����ģ7��1���int������
	}

	public static int rand10() { // дһ������rand10()
		int rand7 = rand7();
		return (rand7 + 3);
	}
}