package ba.bitcamp.Damir.balancingBracket;

public class StackChar {
	
	private Node head;
	
	public StackChar(){
		this.head = null;
	}
	
	public void push(char bracket){
		Node newNode = new Node(bracket);
		if(head == null){
			head = newNode;
			return;
		}
		// every time we add element we ad it on head place
		Node current = head;
		head.next = current;
		head = newNode;

		
	}
	
	public char pop(){
		if(head == null){
			throw new NullPointerException("StackChar is Empty!");
		}
		
		Node current = head;
		char value = current.bracket;
		head = current.next;
		current = null;
		
		return value;
	}
	
	public char peek(){
		if( head == null){
			throw new NullPointerException("Stack is empty!");
		}
		
		return  head.bracket;
	}

	public boolean isEmpty(){
		if( head == null)
			return true;
		return false;
	}
	
	public int getSize(){
		if( head == null){
			return 0;
		}
		Node current = head;
		int count =0 ;
		while( current.next != null){
			current = current.next;
			count ++;
		}
		return count;
	}
	
	private class Node{
		public char bracket;
		public Node next;
		
		public Node (char bracket){
			this.bracket = bracket;
			
		}
		
		
		
		
		

		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param next the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}

		/**
		 * @return the bracket
		 */
		public char getBracket() {
			return bracket;
		}
	}
}
