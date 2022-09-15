/**
 * Application class that tests the methods of the Queue class. It creates a GenericLinkList from the Queue class called queue. It
 * Initializes and then instantiates several GenericNodes that contain the names of customers waiting in line at VegeBurger. It then uses those 
 * GenericNodes to test the Methods of Queue class to see that they can be Enqueue(added) Dequeue(removed) and printed. 
 * @author Chris Burkhead
 * @version 1.1
 * Assignment 2.3
 * CS215-ON
 * Fall 2022
 *
 */

public class Application {

	public static void main(String[] args) {
		
		//initializing the GenericLinkedList Queue and GenericNodes
		Queue queue = new Queue();
		GenericNode<String> node1 = new GenericNode<>();
		GenericNode<String> node2 = new GenericNode<>();
		GenericNode<String> node3 = new GenericNode<>();
		GenericNode<String> node4 = new GenericNode<>();
		GenericNode<String> node5 = new GenericNode<>();
		GenericNode<String> node6 = new GenericNode<>();
		
		//instantiating GenericNodes
		node1.setData("Bill");
		node2.setData("Alice");
		node3.setData("Bob");
		node4.setData("Jane");
		node5.setData("Hamad");
		node6.setData("Jim");
		
		
		//testing Methods
		queue.Enqueue(node1);
		queue.Enqueue(node2);
		queue.Enqueue(node3);
		System.out.println(node1.toString()+node2.toString()+node3.toString()+" are in the queue");
		queue.printQueue();
		
		System.out.println(queue.Dequeue().data+" has been served");
		queue.printQueue();
		
		System.out.println(node4.toString()+" has entered the queue");
		queue.Enqueue(node4);
		queue.printQueue();
		
		System.out.println(node5.toString()+" has entered the queue");
		queue.Enqueue(node5);
		queue.printQueue();
		System.out.println(queue.Dequeue().data+" has been served");
		queue.printQueue();
		System.out.println(queue.Dequeue().data+" has been served");
		queue.printQueue();
	
		System.out.println(node6.toString()+" has entered the queue");
		queue.Enqueue(node6);
		queue.printQueue();
		System.out.println(queue.Dequeue().data+" has been served");
		queue.printQueue();
		System.out.println(queue.Dequeue().data+" has been served");
		queue.printQueue();

		
	}//end main

}//end class
