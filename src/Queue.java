


public class Queue {
	
	GenericLinkedList<String> vegeCustomer= new GenericLinkedList<>();	
	GenericNode<String> customer = new GenericNode<>();
	
	public Queue() {
		
		 
	}//end empty argument constructor
	
	public void Enqueue(String name) {
		System.out.println();	
		customer.setData(name);
		vegeCustomer.addNode(customer);
		System.out.println(customer.getData()+ " Has entered the Queue");
		System.out.println();
	}//end enqueue
	
	public void Dequeue() {
		vegeCustomer.served();
		
	}//end Dequeue
	
	public void printQueue() {
		vegeCustomer.printList();
		System.out.println();
		
	}//end printQueue

}//end class 
