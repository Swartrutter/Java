package cn.dgut.jsny.two;

import java.util.Scanner;

public class MaxSubArray {
	public static void main(String[] args) {
		System.out.println("���������������������ĸ���n");
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];//����һ������
		int n = sc.nextInt();//��ȡ����n
		for(int i = 0 ; i < n ; i++)
		nums[i] = sc.nextInt();//��ȡ�����е�Ԫ��
		int ans = nums[0];
		int sum = 0;
		for(int num : nums) {//��ǿѭ��
		if(sum > 0)
		sum += num;
		else
		sum = num;
		ans = Math.max(ans, sum);//����Math�����ó����ֵ
		}
		System.out.println("��������Ϊ��" + ans);
		sc.close();
		}
}
