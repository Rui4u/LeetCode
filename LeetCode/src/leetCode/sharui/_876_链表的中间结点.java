package leetCode.sharui;

public class _876_链表的中间结点 {
	  public ListNode middleNode(ListNode head) {
		  ListNode[] A = new ListNode[100];
		  int i = 0;
		  while (head != null) {
			A[i] = head;
			head = head.next;
			i ++;
		}
		  return A[i/2];
	  }
	  
	  
	  public ListNode middleNode2(ListNode head) {
		  
		  ListNode slow = head;
		  ListNode quick = head;
		  
		  while (quick != null && quick.next != null) {
			quick = quick.next.next;
			slow = slow.next;
		}
		  return slow;
	  }
}
