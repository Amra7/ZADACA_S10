package ba.bitcamp.homework.Emir.generics;
/*
 * Zadatak 1
 */
import java.util.Iterator;

/**
 * Linked List implements Iterable.
 * @author amrapoprzanovic
 *
 */
public class LinkedList<T> implements Iterable<T>{
	
	private Node head;
	
	public LinkedList(){
		this.head = null;
	}
	
	/**
	 * Adds element into Linked List
	 * @param value
	 */
	public void add(T value){
		Node newNode = new Node(value);
		
		if( head == null){
			head =  newNode;
			return;
		}
		Node current = head;
		while( current.next != null){
			current = current.next;
			
		}
		current.next= newNode;
	}
	
	/**
	 * Removes element form Linked List on position offset.
	 * @param offset - number position of element in linked lit.
	 */
	public void remove(int offset){
		if( head ==  null){
			return ;
		}
		Node current = head;
		if (offset == 0){
			head = current.next;
			return;
		}
		
		
		Node prev = head;
		current = head.next;
		int counter = 1;
		
		while ( counter < offset){
			prev = prev.next;
			current = current.next;
			counter++;
		}
		prev.next =  current.next;
		current =  null;
	}
	
	/**
	 * Getter for size of Linked List.
	 * @return
	 */
	public int getSize(){
		int size=0;
		Node current = head;
		while ( current !=  null){
			current =  current.next;
			size++;
		}
		return  size;
	}
	
	/**
	 * Checks if Linked List contains forwarded value.
	 * @param value -  value that we are searching in linked list.
	 * @return true if it contains forwarded value or false if it does not contain.
	 */
	public boolean contains(T value){
		if ( head == null){
			return false;
		} else {
			return contains( head,value);
		}
	}
	
	private boolean contains(Node current, T value) {
		if ( current.value == value){
			return true;
		} else {
			return contains( current.next, value);
		}
		
	}

	/**
	 * Converts all elements of linked list into String.
	 * @return String of all elements from Linked List.
	 */
	public String toString(){
		String str = "";
		str += "[ ";
		Node current =  head;
		while ( current !=  null){
			str += current.value;
			if( current.next !=  null){
				str += ", ";
			}
			current =  current.next;
		}
		str += " ]";
		return str;
	}
	
	
	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(head);
	}

	private class MyIterator<T> implements Iterator<T>{
		private Node<T> current;
		
		public MyIterator(Node start){
			current = start;
		}

		@Override
		public boolean hasNext() {
			if (current != null){
				return true;
			}
			return false;
		}

		@Override
		public T next() {
			T value =  current.value;
			current = current.next;
			return value;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	
	/**
	 * Inner class Node
	 * @author amrapoprzanovic
	 *
	 * @param <T>
	 */
	public class Node<T>{
		public  T value;
		public Node next;
		
		public Node(T value){
			this.value = value;
		}
	}





	
}
