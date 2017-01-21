package JOTest;

/**
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up: Can you solve it without using extra space?
 * 
 * 用到了点额外的空间，坑
 * 思路：
 *     head的next不断指向head.next.next, 同时head不再指向的节点全部指向head,那之后如果
 *     有任何一个节点开始有循环则最终都会指向head
 * 
 */
public class LinkedListCycle {
	static ListNode temp;
	
	public  static boolean hasCycle(ListNode head){
		if(head == null || head.next == null)
			return false;
		if(head.next == head)
			return true;
		temp = head.next;
		head.next = head.next.next;
		temp.next = head; 
		return hasCycle(head);
	}
	
	public static void main(String[] args){
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(0);
		ListNode node4 = new ListNode(-4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;
		
		System.out.println(hasCycle(node1));
	}
}
