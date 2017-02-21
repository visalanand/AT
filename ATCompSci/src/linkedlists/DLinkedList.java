package linkedlists;

public class DLinkedList {
	private DListNode firstNode;
	private DListNode lastNode;

	/**
	 * Construct an empty list
	 */
	public DLinkedList() {
		firstNode = null;
		lastNode = null;
	}

	/**
	 * Returns true if the list contains no elements
	 */
	public boolean isEmpty(){
		
		return firstNode == null;
		
	}
	
	

	/**
	 * Inserts the argument as the first element of this list.
	 */

	public void addFirst(Object o) {
		DListNode obj = new DListNode (o, firstNode, null);
		
		
	}
		
	/**
	 * Inserts the argument as the last element of this list.
	 */

	public void addLast(Object o) {
		
		DListNode obj = new DListNode (o, null, lastNode);
		
	}

	/**
	 * Removes and returns the first element of this list.
	 */

	public Object removeFirst() {
		
		
		firstNode = firstNode.getNext();
		firstNode.getPrevious().setNext(null);
		return firstNode;
	}

/**
	 * Removes and returns the last element of this list.
	 */

	public Object removeLast(){
	
	DListNode prev = lastNode.getPrevious();
		lastNode.setPrevious(null);
		prev.setNext(null);
		return lastNode;
	}	
	

	
	/**
	 * Returns a String representation of the list.
	 */
	public String toString() {
		String n = "";
		DListNode a = firstNode;
		while (a != null){
			n += a.getValue()+" ";
			a = a.getNext();
		}
		return n;
	}

	
	public DListNode getFirstNode() {
		return firstNode;
	}

	public void setFirstNode(DListNode firstNode) {
		this.firstNode = firstNode;
	}

	public DListNode getLastNode() {
		return lastNode;
	}

	public void setLastNode(DListNode lastNode) {
		this.lastNode = lastNode;
	}

	/**
	 * Returns the number of elements in the list as an int.
	 */
public int size() {
	int n = 0;
	DListNode d  = firstNode; 
	while (d != null){
		n++;
		
	}
	return n;
	
	}
	/**
	 * Removes all of the elements from this list.
	 */
	private void clear() {
		DListNode a;
	while (firstNode != null){
		firstNode = firstNode.getNext();
		a = firstNode.getPrevious();
		a = null;
	}
		
	}
	/**
	 * Returns a DListIterator.
	 */

	public DListIterator iterator() {
		return new DListIterator(this);

	}
}