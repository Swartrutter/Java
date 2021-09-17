package cn.dgut.jsny.two;

import java.util.Scanner;

public class MaxSubArray {
	public static void main(String[] args) {
		System.out.println("输入你想给定的整数数组的个数n");
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];//建立一个数组
		int n = sc.nextInt();//读取数组n
		for(int i = 0 ; i < n ; i++)
		nums[i] = sc.nextInt();//读取数组中的元素
		int ans = nums[0];
		int sum = 0;
		for(int num : nums) {//增强循环
		if(sum > 0)
		sum += num;
		else
		sum = num;
		ans = Math.max(ans, sum);//调用Math方法得出最大值
		}
		System.out.println("最大子序和为：" + ans);
		sc.close();
		}
}
