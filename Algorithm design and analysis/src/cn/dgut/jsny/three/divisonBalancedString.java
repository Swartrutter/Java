package cn.dgut.jsny.three;

import java.util.Scanner;

public class divisonBalancedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();//���û����������ַ���
		int res = split(s);//����split���������������
		System.out.println(res);//���res
		sc.close();//�ر�sc
	}
	public static int split(String s) {//�ָ�ƽ���ַ����ķ���
        int num = 0;//��ʼ������num��¼�ַ�����L/R������
        int res = 0;//��¼�ɷָ���ִ�������
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'L')
                num++;
            else
                num--;
            if(num == 0)
                res++;
        }
        return res;
    }
}
