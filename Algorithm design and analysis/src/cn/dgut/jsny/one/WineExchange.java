package cn.dgut.jsny.one;

import java.util.Scanner;

public class WineExchange {
	public static void main(String[] args) {
		System.out.println("������Ҫ����ľ�ƿ�����Ͷ��ٸ��վ�ƿ��һƿ��");
		Scanner sc = new Scanner(System.in);
		int numBottles = sc.nextInt(); //���빺��ľ�ƿ����
		int numExchange = sc.nextInt(); //������ٸ��վ�ƿ��һƿ��
		System.out.println("���ͣ��㹺����" + numBottles + "ƿ�ƣ��������" + numExchange + "ƿ�ƶһ�һƿ��");
		int flag = numBottles; //����һ��flag����flagΪ0�����ѭ��
		int count = numBottles; //�����ܺȵ��Ƶ�����
		while(flag / numExchange != 0) {
			int yu = flag % numExchange;
			flag = flag / numExchange;
			count = count + flag;
			if (flag + yu >= numExchange) { //�ж�ǰһ�λ���Ŀվ�ƿ�ͻ��������¾�֮���Ƿ����ٻ�һ�Σ�������count++
				count++;
			}
		}
		System.out.println("�������������ܺȵ�" + count + "ƿ��");//���
		sc.close();
	}
}
