package DV算法实现;

import java.util.Scanner;

public class DV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("请输入路由器的个数：");
		int num = sc.nextInt();
		Router[] rs = new Router[num];
		int i=0;
		for(i=0;i<num;i++) {
			int[] v = new int[num];
			System.out.printf("请输入第%d个路由器的初始信息：",i);
			for(int j=0;j<num;j++) {
				v[j]=sc.nextInt();
			}
			rs[i]=new Router(num,i,v);
		}
		int m=0;
		int re=0;
		while(re!=3) {
			re=0;
			int[][] t = new int [num][num];
			for(i=0;i<num;i++) {
				t[i]=rs[i].getVector();
			}
			for(i=0;i<num;i++) {
				re=re+rs[i].updateTable(t);
			}
		}
		for(i=0;i<num;i++){
			rs[i].Print();
		}
	}
}

class Router
{
	private int num;
	private int order;
	private int[][] table;
	
	public Router(int num, int order,int [] v) {
		super();
		this.num = num;
		this.order = order;
		table = new int [num][num];
		table[order]=v;
	}
	
	void Print() {
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.printf("%d ",table[i][j]);
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}
	
	int[] getVector() {
		return table[order];
	}
	
	int updateTable(int[][] T) {
		int i=0,j=0,re=1;
		table=T;
		for(i=0;i<num;i++) {
			for(j=0;j<num;j++) {
				int a=table[order][j]+T[j][i];
				if(a<table[order][i]) {
					re=0;
					table[order][i]=a;
				}
			}
		}
		return re;	
	}
}
