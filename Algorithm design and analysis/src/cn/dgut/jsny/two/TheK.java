package cn.dgut.jsny.two;

import java.util.Scanner;

public class TheK {
	public static void main(String[] args) {
		int[] arry = new int [10]; //����һ������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ����������������Ҫ���������ҵ��ĵ�K�����Ԫ��");
		int n = sc.nextInt();//��ȡ�������
		int k = sc.nextInt();//��ȡ�����еĵ�K����ֵ
		for(int i = 0 ; i < n ; i++) 
		arry[i] = sc.nextInt();//ѭ���Ӽ����ж�ȡ��������
		for(int i = 0 ; i < n-1 ; i++) {
		for (int j = 0 ; j < n-1-j ; j++) {//˫��ѭ��
		if(arry[j] > arry[j+1]) {
		int k1 = arry[j];
		arry[j] = arry[j+1];
		arry[j+1] = k1;//ð�ݷ���С������������
		}
		}
		}
		System.out.println("��Ҫ�ҵĵ�K�����Ԫ��Ϊ��" + arry[n - k - 1]);//ֱ���ҳ������еĵ�K�����Ԫ��
		sc.close();
		}
}
