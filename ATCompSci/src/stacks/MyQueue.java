package stacks;


	//Use this interface to complete your implementation
	public interface MyQueue {

		//Tests if this queue is empty
		public boolean empty();
		
		//Inserts the specified element into this queue
		public boolean offer(Object item);
		
		//Retrieves and removes the head of this queue,
		//or returns null if this queue is empty.
		public Object poll();
		
		//Retrieves, but does not remove, the head of this queue,
		//or returns null if this queue is empty
		public Object peek();


		//Returns a String representation of your queue
		public String  toString();

		


//
//	Add these methods to your implementation
//		
//	     *Adds q to the end of the current queue. Queue q is then cleared.
//	    
//		public void append(ArrayListQueue q) 
//
//		{
//		
//		}
//
//	
//	     * Inserts q to the current queue alternately. 
//	* Queue q is then cleared.
//	     
//		public ArrayListQueue alternate(ArrayListQueue q)
//
//		{
//
//		}

}
