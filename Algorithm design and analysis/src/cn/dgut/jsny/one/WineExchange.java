package cn.dgut.jsny.one;

import java.util.Scanner;

public class WineExchange {
	public static void main(String[] args) {
		System.out.println("请输入要购买的酒瓶数量和多少个空酒瓶换一瓶酒");
		Scanner sc = new Scanner(System.in);
		int numBottles = sc.nextInt(); //输入购买的酒瓶数量
		int numExchange = sc.nextInt(); //输入多少个空酒瓶换一瓶酒
		System.out.println("解释：你购买了" + numBottles + "瓶酒，你可以用" + numExchange + "瓶酒兑换一瓶酒");
		int flag = numBottles; //定义一个flag，若flag为0则结束循环
		int count = numBottles; //最终能喝到酒的数量
		while(flag / numExchange != 0) {
			int yu = flag % numExchange;
			flag = flag / numExchange;
			count = count + flag;
			if (flag + yu >= numExchange) { //判断前一次换后的空酒瓶和换回来的新酒之和是否还能再换一次，若是则count++
				count++;
			}
		}
		System.out.println("所以最后你最多能喝到" + count + "瓶酒");//输出
		sc.close();
	}
}
