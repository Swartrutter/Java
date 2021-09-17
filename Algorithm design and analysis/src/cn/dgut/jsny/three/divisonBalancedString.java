package cn.dgut.jsny.three;

import java.util.Scanner;

public class divisonBalancedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();//从用户键盘输入字符串
		int res = split(s);//调用split方法并将结果返回
		System.out.println(res);//输出res
		sc.close();//关闭sc
	}
	public static int split(String s) {//分割平衡字符串的方法
        int num = 0;//初始化变量num记录字符串中L/R的数量
        int res = 0;//记录可分割的字串的数量
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
