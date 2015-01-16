package ba.bitcamp.homework.Benjo.TreeStackQueue;

public class ShelterTest {

	public static void main(String[] args) {
		Shelter<String> sh = new Shelter<String>();
		
		sh.enqueue("cat");
		sh.enqueue("cat");
		sh.enqueue("dog");
		sh.enqueue("cat");
		sh.enqueue("dog");		
		sh.enqueue("cat");
		sh.enqueue("dog");
		sh.enqueue("dog");
		
		System.out.println("Print: "+ sh.toString());
		
		sh.dequeueAny();
		System.out.println("DeQueue Any: "+ sh.toString());
		
		sh.dequeueCat();
		System.out.println("DeQueue cat: "+ sh.toString());
		
		sh.dequeueDog();
		System.out.println("DeQueue dog: "+ sh.toString());
		
	}
}
