package cn.dgut.jsny.one;

public class ListNode {

	//Ϊ����ʹ�ã�����ʹ��public
		public int data;   //������ݵı���
		public ListNode next;   //��Ž��ı�����Ĭ��Ϊnull
		public ListNode(){}    //�޲ι��췽��
		
		//��ӽ��
		public void add(int newdata){
			ListNode newNode = new ListNode();    //����һ�����
			if(this.next == null){
				this.next  = newNode;
			}
			else{
				this.next.add(newdata);
			}
		}


	//�������ֵ
		public void print(){
			System.out.print(this.data+"-->");
			if(this.next != null){
				this.next.print();
			}
		}
		
}
