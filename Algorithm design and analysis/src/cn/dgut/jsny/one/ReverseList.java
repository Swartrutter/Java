package cn.dgut.jsny.one;

public class ReverseList {
	public static void main(String[] args) {
		System.out.println("��������Ҫ��ת�ĵ�����");
		initListNode(ListNode L); //��ʼ��������
		insertListNode(ListNode L , String data); //�ڵ�����β����������
		reverseList(ListNode head); //��ת������
	}
	public static void initListNode(ListNode L) {
		L.data = 0;
		L.next = null;
	}
	public static void insertListNode(ListNode L , String data) {
		
	}
public ListNode reverseList(ListNode head) {
	ListNode pre = null;
	ListNode cur = head; //������pre��cur�����ֱ�ֵΪnull��head��
	ListNode tmp = null; //������ʱ���tmp��ָ��null��
	
	while(cur!=null) {
		tmp = cur.next; //����ʱ���tmpָ����һ�����
		cur.next = pre; //����ǰ���ָ��pre���
		pre = cur;
		cur = tmp; //���pre��cur��ǰ��һλ
		}
	
		return pre; //���ط�ת�ĵ�����pre
	}
}