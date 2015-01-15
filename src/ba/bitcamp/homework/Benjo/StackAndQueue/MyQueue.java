package ba.bitcamp.homework.Benjo.StackAndQueue;

public class MyQueue {

	
	private MyStack stackIn;
	private MyStack stackOut;
	
	public MyQueue() {
		this.stackIn = new MyStack();
		this.stackOut =  new MyStack();
	}
	
	public void push(int value){
		stackIn.push(value);		
	}
	
	public int pop(){
		int size = stackIn.getSize();
		int count =0;
		while ( count < size){
			int value = stackIn.pop();
			stackOut.push(value);
			count++;
		}
		
		int queueValue = stackOut.pop();	
		return queueValue;
	}
	
	/**
	 * Converts all elements of Queue in String.
	 */
	public String toString(){
		int size = stackIn.getSize();
		int count =0;
		while ( count < size){
			int value = stackIn.pop();
			stackOut.push(value);
			count++;
		}
		return stackOut.toString();
	}

	/**
	 * Inner class Node
	 * 
	 * @author amrapoprzanovic
	 *
	 */
	private class Node {
		public int value;
		public Node next;

		/**
		 * Constructor for Node.
		 * 
		 * @param value
		 */
		public Node(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return value;
		}
	}
}
