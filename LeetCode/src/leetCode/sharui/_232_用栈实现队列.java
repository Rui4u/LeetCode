package leetCode.sharui;

import java.util.Stack;

public class _232_用栈实现队列 {

	private Stack<Integer> inStack;
	private Stack<Integer> outStack;

	/**
	 * Initialize your data structure here.
	 * 
	 * @return
	 */
	public _232_用栈实现队列() {
		inStack = new Stack<>();
		outStack = new Stack<>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		inStack.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		cheackOutStack();
		return outStack.pop();
	}

	/** Get the front element. */
	public int peek() {
		cheackOutStack();
		return outStack.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return outStack.empty() && inStack.empty();
	}
	
	void cheackOutStack() {
		if (outStack.empty()) {
			while (!inStack.empty()) {
				outStack.push(inStack.pop());
			}
		}
	}
}
