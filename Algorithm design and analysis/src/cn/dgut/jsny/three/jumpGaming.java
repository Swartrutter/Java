package cn.dgut.jsny.three;

import java.util.Scanner;

public class jumpGaming {
	public static void main(String[] args) {
		int[] a = new int[10];
		int n;// ��ʼ��������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�ж������Ԫ�ظ�����");
		n = sc.nextInt();
		System.out.println("��������������Ԫ�أ�");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();// �ֱ���û����������������ܸ����������и�Ԫ�ص�ֵ
		System.out.println("�жϽ����true��ʾ���Դﵽ���λ�ã�false��ʾ���ܴﵽ���λ�ã�");
		int count = 0;// ����һ������������ǰ��λԪ���ܴﵽ�����λ��
		int flag = 0;// ����һ����־��ֵ
		for (int i = 0; i < n; i++) {
			if ((flag + a[i]) >= i + 1) {
				count++;// ǰ��λԪ��֮�ʹ���λ�����ܺ�,�ܴﵽ���λ����������+1
			} else {
				break;
			}
		}
		if (count >= n)
			count = n;
		int laji = 0;
		for (int i = 0; i < count; i++) {// ��ʼ�ж������е�Ԫ���ܷ���Ծ�����һ��λ��
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