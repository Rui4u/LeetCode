package leetCode.sharui;

public class _206_反转链表 {
	//递归
    public ListNode reverseList(ListNode head) {
    	if (head == null || head.next == null) {
			return head;
		}
    	ListNode headerListNode = reverseList(head.next);
    	head.next.next = head;
    	head.next = null;
		return headerListNode;
    }
    
    //迭代
    public ListNode reverseList2(ListNode head) {
    	ListNode temp = null;
    	ListNode newHeader = null;
    	
    	while(head != null) {
    		
    		temp = head.next;
    		head.next = null;
    		newHeader = head;
    		head = temp;
    	}
		return newHeader;
    	
    }
}
