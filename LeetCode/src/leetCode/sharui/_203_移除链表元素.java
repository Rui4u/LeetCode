package leetCode.sharui;

public class _203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
    	if (head == null) {
			return head;
		}
    	head.next = removeElements(head.next, val);
    	if (head.val == val) {
			return head.next;
		}
    	return head;
    }
}
