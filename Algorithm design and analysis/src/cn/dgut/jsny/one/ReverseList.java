package cn.dgut.jsny.one;

public class ReverseList {
	public static void main(String[] args) {
		System.out.println("请输入需要反转的单链表");
		initListNode(ListNode L); //初始化单链表
		insertListNode(ListNode L , String data); //在单链表尾部插入数据
		reverseList(ListNode head); //反转单链表
	}
	public static void initListNode(ListNode L) {
		L.data = 0;
		L.next = null;
	}
	public static void insertListNode(ListNode L , String data) {
		
	}
public ListNode reverseList(ListNode head) {
	ListNode pre = null;
	ListNode cur = head; //申请结点pre和cur，并分别赋值为null和head。
	ListNode tmp = null; //申请临时结点tmp并指向null。
	
	while(cur!=null) {
		tmp = cur.next; //将临时结点tmp指向下一个结点
		cur.next = pre; //将当前结点指向pre结点
		pre = cur;
		cur = tmp; //结点pre和cur都前进一位
		}
	
		return pre; //返回反转的单链表pre
	}
}