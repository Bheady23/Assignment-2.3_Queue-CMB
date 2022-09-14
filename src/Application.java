

public class Application {

	public static void main(String[] args) {
		
		Queue vegeQueue = new Queue();
		
		vegeQueue.Enqueue("Bill");
		vegeQueue.printQueue();
		vegeQueue.Enqueue("Alice");
		vegeQueue.printQueue();
		vegeQueue.Enqueue("Bob");
		vegeQueue.printQueue();
		vegeQueue.Dequeue();
		vegeQueue.printQueue();
		vegeQueue.Enqueue("Jane");
		vegeQueue.printQueue();
		vegeQueue.Enqueue("Hamad");
		vegeQueue.printQueue();
		vegeQueue.Dequeue();
		vegeQueue.printQueue();
		vegeQueue.Dequeue();
		vegeQueue.printQueue();
		vegeQueue.Enqueue("Jim");
		vegeQueue.printQueue();
		vegeQueue.Dequeue();
		vegeQueue.printQueue();
		vegeQueue.Dequeue();
		vegeQueue.printQueue();
	}//end main

}//end class
