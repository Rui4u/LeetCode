package leetCode.sharui;

import java.util.LinkedList;

class _225_用队列实现栈 {

    /** Initialize your data structure here. */
	private LinkedList<Integer> queue1 = new LinkedList<Integer>();
	private LinkedList<Integer> queue2 = new LinkedList<Integer>();
	private int top = -1;
	private int topIndex = 0;
	
    public _225_用队列实现栈() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
        top = x;
        topIndex ++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for (int i = 0; i < topIndex - 1; i++) {
        	top = queue1.get(i);
			queue2.add(top);
		}
        int temp = queue1.get(topIndex - 1);
        
        queue1 = queue2;
        queue2 = new LinkedList<Integer>();
        topIndex --;
        return temp;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}
