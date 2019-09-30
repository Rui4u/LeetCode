package leetCode.sharui;

public class _083_删除排序链表中的重复元素 {
	  public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		head.next = deleteDuplicates(head.next);
		if (head.val == head.next.val) {
			return head.next;
		}
		return head;
	  }
}
