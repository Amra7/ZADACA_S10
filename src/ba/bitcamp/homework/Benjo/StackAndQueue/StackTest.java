package ba.bitcamp.homework.Benjo.StackAndQueue;

public class StackTest {

	public static void main(String[] args) {
		Stack s=  new Stack();
		
		System.out.println("Is empty: " + s.isEmpty());
		s.push(12);
		s.push(45);
		s.push(2);
		s.push(67);
		s.push(122);
		s.push(4);
		s.push(23);
		s.push(89);
		
		
		System.out.println("Is empty: " + s.isEmpty());
		System.out.println("Min number: " + s.getMin());
		
	}

}
