package leetCode.sharui;

public class _021_合并两个有序链表 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode newNode = new ListNode(-1);
		ListNode prev = newNode;
		
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				prev.next = l1;
				l1 = l1.next;
			}else {
				prev.next = l2;
				l2 = l2.next;
			}
			prev = prev.next;
		}
		
		prev.next = (l1 == null) ? l2 : l1;	
		
		return newNode.next;
	}
	
	
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}else if (l2 == null) {
			return l1;
		}else  if (l1.val < l2.val) {
			l1.next = mergeTwoLists2(l1.next, l2);	
			return l1;
		}else {
			l2.next = mergeTwoLists2(l1, l2.next);
			return l2;
		}	
	}
}
