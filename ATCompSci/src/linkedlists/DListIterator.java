package linkedlists;

public class DListIterator  {

	private DListNode current;
	private DListNode previous;
	private DLinkedList myList;
	private boolean canRemove; // for remove() method. true if OK to call
								// remove()

	public DListIterator(DLinkedList list) {
		myList = list;
		current = null;
		previous = null;
		canRemove = false;
	}

	public String toString() {
		DListNode a = myList.getFirstNode();
		String n = "";
		while(a != null){                                                                                                                                  
			n = n+a.getValue()+" ";
		}
		return n;
	}
		
	public boolean hasPrevious() {
		return previous != null;
	}
		
	public boolean hasNext(){
		return current.getNext() != null;
	}

	public Object next() {
		current = current.getNext();
		previous = previous.getNext();
		return current.getNext();
	}
		
	public Object previous(){
		previous = previous.getPrevious();
		current = current.getPrevious();  
		return previous;
	}

	public void remove(){
		previous.setNext(current.getNext());
	}

	public void add(Object element) {
		DListNode dlist = (DListNode)element;
		previous.setNext(dlist);
		dlist.setNext(current);
		
	}

	public void set(Object element) {
		DListNode dlist = (DListNode) element;
		dlist.setPrevious(previous);
		dlist.setNext(current.getNext());
		current = dlist;
	}
		
	}



                                                                    