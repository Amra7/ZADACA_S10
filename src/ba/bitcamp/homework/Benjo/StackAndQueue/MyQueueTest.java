package ba.bitcamp.homework.Benjo.StackAndQueue;

public class MyQueueTest {

	public static void main(String[] args) {
		
		MyQueue q = new MyQueue();
		q.push(10);
		q.push(15);
		q.push(27);
		q.push(48);
		q.push(456);
		
		System.out.println("Pop: " + q.pop());
		
		System.out.println("Print: "+ q.toString());
	}

}
