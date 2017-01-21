package JOTest;

/**
 * 
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * For example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return 1->2->3.
 * 
 * @author XB
 *
 */

public class RemoveDuplicatesFromSortedList {
	
	public static ListNode deleteDuplicates(ListNode head){
		ListNode node = head;
		delete(node);
		return head;
	}
	
	public static void  delete(ListNode node){
		if(node == null || node.next == null)
			return;
		if(node.val == node.next.val)
			node.next = node.next.next;
		else
			node = node.next;
		delete(node);
	}
	
	public static void main(String[] args){
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		ListNode temp = deleteDuplicates(node1);
		while(temp != null){
			System.out.println(temp.val);
			temp = temp.next;
		}
			
	}
}
