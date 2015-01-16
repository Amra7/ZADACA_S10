package ba.bitcamp.homework.Benjo.TreeStackQueue;

public class Shelter<T> {
	
	private Node head;
	private Node tail;
	
	
	public Shelter(){
		this.head = null;
		this.tail = null;
	}
	
	public void enqueue(T type){
		Node newNode = new Node(type);
		if( head == null){
			head = newNode;
			tail = head;
			return;
		}
		
		tail.next = newNode;
		tail = tail.next;
		
	}
	
	public T dequeueAny(){
		if( head==null){
			throw new NullPointerException("Shalter is empty!");
		}
		if( head == tail){
			T type = (T)head.type;
			Node current = head;
			head = current.next;
			head = tail = null;
			return type;
		}
		
		Node current = head;		
		T type = (T)head.type;
		head = head.next;
		current = null;
		return type;
		
	}
	
	public T dequeueCat(){
		
		if( head==null){
			throw new NullPointerException("Shalter is empty!");
		}
		
		Node current = head;
		if( current.type.equals("cat")){
			T type = (T)current.type; 
			head = current.next;
			return type;
		}
		
		current = head.next;
		Node prev = head;
		while( !current.type.equals("cat") && current.next != null){
			current = current.next;
		}
		prev.next = current.next;
		T type = (T)current.type; 
		return type;
	}
	
	public T dequeueDog(){
		
		if( head==null){
			throw new NullPointerException("Shalter is empty!");
		}
		
		Node current = head;
		if( current.type.equals("dog")){
			T type = (T)current.type; 
			head = current.next;
			return type;
		}
		
		current = head.next;
		Node prev = head;
		while( !current.type.equals("dog") && current.next != null){
			current = current.next;
		}
		prev.next = current.next;
		T type = (T)current.type; 
		return type;
	}
	
	public String toString(){
		String str = "";
		str += "[ ";
		Node current = head;
		while( current != null){
			str += current.type;
			if ( current.next != null){
				str += ", ";
			}
			current = current.next;
		}
		str += " ]";
		return str;
	}
	

	
	public class Node<T> {
		public T type;
		public Node next;
		
		/**
		 * Constructor for Node.
		 * @param type - type of object we add.
		 */
		public Node(T type){
			this.type=type;
		}

		/**
		 * @return the type
		 */
		public T getType() {
			return type;
		}

		/**
		 * @param type the type to set
		 */
		public void setType(T type) {
			this.type = type;
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
	}
	
}
