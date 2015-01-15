package ba.bitcamp.homework.Benjo.StackAndQueue;


public class MyStack {

	private Node head;

	public MyStack() {
		this.head = null;
	}

	/**
	 * Push new element on last place of link.
	 * @param value - new Vale that we put in Queue.
	 */
	public void push(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;

	}
	
	/**
	 * Pop out integer from stack.
	 * 
	 * @return - last integer from stack
	 */
	public int pop(){
		if( head == null){
			throw new NullPointerException("Stack is empty!");
		}
		Node current = head;
		head = current.next;
		int value =  current.value;		
		current= null;
		return value;
	}
	
	public int peek(){
		if ( head== null){
			throw new NullPointerException("Stack is empty!");
		}
		return head.value;
	}
	
	/**
	 * Get Size.
	 * @return size of linked list.
	 */
	public int getSize(){
		int size=0;
		Node current =head;
		while( current != null) {
			current =  current.next;
			size++;
		}
		return size;
	}
	
	/**
	 * Contains  value.
	 * @param value - value that we forwarding.
	 * @return true if it contains value or false if it does not.
	 */
	public boolean contains( int value){
		if ( head ==  null){
			return false;
			
		} else {
			return contains( head, value);
		}
	}
	private boolean contains(Node current, int value) {
		if ( current.value == value){
			return true;
		} else {
			return contains( current.next, value);
		}
		
	}

	/**
	 * Converts all elements of Stack in String.
	 */
	public String toString(){
		String str = "";
		Node current = head;
		str += "[ ";
		while(current != null){
			str += current.value;
			if(current.next != null)
				str += ", ";
			current = current.next;
		}
		str += " ]";
		return str;
	}


	/**
	 * Inner class Node.
	 * 
	 * @author amrapoprzanovic
	 *
	 */
	public class Node {
		public int value;
		public Node next;

		/**
		 * Constructor for Node
		 * 
		 * @param value
		 */
		public Node(int value) {
			this.value = value;
		}

		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param next
		 *            the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}

		/**
		 * @return the value
		 */
		public int getValue() {
			return value;
		}
	}

}
