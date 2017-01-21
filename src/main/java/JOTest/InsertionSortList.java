package JOTest;
/**
 * Sort a linked list using insertion sort.
 * 
 * @author XB
 *
 */
public class InsertionSortList {

	public static ListNode sort(ListNode head) {
		
		return head;
	}
	
	public static void link(){
		
	}
	
	public static void solution(){
		
	}

	public static void main(String[] args){
		ListNode h1 = new ListNode(7);
		ListNode h2 = new ListNode(2);
		ListNode h3 = new ListNode(5);
		ListNode h4 = new ListNode(1);

		
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		
		ListNode result = sort(h1);
		while(result.next!=null){
			System.out.println(result.val);
			result = result.next;
		}
		
	}
}

