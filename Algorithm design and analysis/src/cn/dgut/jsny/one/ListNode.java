package cn.dgut.jsny.one;

public class ListNode {

	//为方便使用，变量使用public
		public int data;   //存放数据的变量
		public ListNode next;   //存放结点的变量，默认为null
		public ListNode(){}    //无参构造方法
		
		//添加结点
		public void add(int newdata){
			ListNode newNode = new ListNode();    //创建一个结点
			if(this.next == null){
				this.next  = newNode;
			}
			else{
				this.next.add(newdata);
			}
		}


	//输出结点的值
		public void print(){
			System.out.print(this.data+"-->");
			if(this.next != null){
				this.next.print();
			}
		}
		
}
