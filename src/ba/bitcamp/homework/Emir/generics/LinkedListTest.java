package ba.bitcamp.homework.Emir.generics;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(5);
		ll.add(45);
		ll.add(34);
		ll.add(67);
		ll.add(89);
		ll.add(123);
		
		System.out.println(ll.toString());
		
		// contains
		System.out.println("Contains: " + ll.contains(45));
		
		// remove
		ll.remove(3);
		System.out.println("Removed: " + ll.toString());
		
		// get size
		System.out.println("Get size: " + ll.getSize());
		
		
	}

}
