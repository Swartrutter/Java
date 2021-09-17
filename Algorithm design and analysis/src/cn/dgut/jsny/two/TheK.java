package cn.dgut.jsny.two;

import java.util.Scanner;

public class TheK {
	public static void main(String[] args) {
		int[] arry = new int [10]; //建立一个数组
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要排序的数组个数和你要在数组中找到的第K个最大元素");
		int n = sc.nextInt();//读取数组个数
		int k = sc.nextInt();//读取数组中的第K个数值
		for(int i = 0 ; i < n ; i++) 
		arry[i] = sc.nextInt();//循环从键盘中读取数组数据
		for(int i = 0 ; i < n-1 ; i++) {
		for (int j = 0 ; j < n-1-j ; j++) {//双层循环
		if(arry[j] > arry[j+1]) {
		int k1 = arry[j];
		arry[j] = arry[j+1];
		arry[j+1] = k1;//冒泡法从小到大排序数组
		}
		}
		}
		System.out.println("你要找的第K个最大元素为：" + arry[n - k - 1]);//直接找出数组中的第K个最大元素
		sc.close();
		}
}
