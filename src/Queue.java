/**
 * The Class Queue uses the GenericLinkedList and GenericNode classes to add and remove String objects from a Generic Linked list
 * that is meant to simulate standing in Queue at the restaurant VegeBurger. It extends the GenericLinkedList class so that it can use it's variables
 * constructors more easily.
 * 
 * @author Chris Burkhead
 * @version 1.1
 * Assignment 2.3 
 * CS215-ON 
 * Fall 2022
 *
 */


public class Queue extends GenericLinkedList<String> {
	
	//instance variable, initializing the GenericLinked list
	GenericLinkedList<String> vegeCustomer= new GenericLinkedList<>();	
	
	/**
	 * Empty argument constructor calls in the constructor from Generic Linked List
	 */
	public Queue() {
		super();
	}//end empty argument constructor
	
	/**
	 * Enqueue() uses the addNode() from GenericLinkedList to add the data from the Nodes instantiated in the Application class
	 * to the LinkedList 
	 * @param aNode is GenericNode<String> defined in the Application class
	 */
	public void Enqueue(GenericNode<String> aNode) {
			
		vegeCustomer.addNode(aNode);
		
	}//end enqueue
	
	/** 
	 * printQueue methods prints the LinkedList in order from head to tail. If the LinkedList is empty it returns. 
	 * If it not empty then it executes a while loop until all objects in the list have been printed. 
	 */
	public void printQueue() {  
				
				//checks to see if the Linked list is empty
		        GenericNode<String> current = vegeCustomer.head;  
		        if(vegeCustomer.head == null) {  
		            System.out.println("List is empty");  
		            return;  }
		        
		        System.out.print("The following customers remain in the Queue: ");
		        
		        //while loop prints each item in the list until it finds the empty tail
		        while(current != null) {  
		            System.out.print(current.data + ", ");  
		            current = current.nextNode;  
		        }//end while
		        System.out.println();
		        System.out.println();
		        
		    }//end printQueue 
	
	/**
	 * Dequeue() returns the GenericNode<String> of the head of the LinkedList, it then removes that head by setting the head pointer to the 
	 * nextNode in the List. 
	 * @return variable served is of type GenericNode<String>
	 */
	public GenericNode<String> Dequeue() {
		GenericNode<String> served=vegeCustomer.head;
		
		//checking to see if the head is empty before removing and returning the head node.
		if (vegeCustomer.head==null) {
			return null;}
		
			vegeCustomer.head=served.nextNode;
			served.nextNode=null;
			return served;		
		
	}//end Dequeue
	
}//end class 
