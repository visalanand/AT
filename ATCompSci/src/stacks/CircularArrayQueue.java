package stacks;

import java.util.ArrayList;

public class CircularArrayQueue{
private int head; 
private int tail;
private int theSize;
private Object[] elements;

public CircularArrayQueue(int capacity) {
	head = -1;
	tail = -1;
	theSize = 0;
	elements = new Object[capacity];
} 
public void add(Object x) { 
	if(head == -1){
		head = 0;
		tail = 1;
		theSize = 1;
		elements[0] = x;
	}
	else{
		if(tail == elements.length)
			for(int i = 0; i < head; i++)
				if(elements[i] == null){
					tail = i;
					break;
				}
		if(tail == elements.length || tail == head){
			DoubleArray();
			elements[tail] = x;
			tail++;
		}
		else{
			elements[tail] = x;
			tail++;
		}
	}
	
	theSize++;
} 
private void DoubleArray(){
	Object[] lengthDoubled = new Object[elements.length * 2];
	int index = 0;
	int size = theSize;
	while(theSize > 0){
		lengthDoubled[index] = remove();
		index++;
	}
	
	head = 0;
	tail = size - 1;
	theSize = size;
	elements = lengthDoubled;	
}
public Object remove() {
	Object object = elements[head];
	elements[head] = null;
	head++;
	if(head == elements.length)
		head = 0;
	theSize--;
	return object;
} 
public int size() { 
	return theSize;
}
public String toString(){
	String s = "";
	for(Object x : elements)
		s += x +" ";
	
	return s;
}
		public static void main (String[] args){
			
		
				 CircularArrayQueue a = new CircularArrayQueue(10);
				 a.add(1);
				 a.add(2);
				 a.add(3);
				 a.add(4);
				 a.add(5);
				 a.add(6);
				 a.add(7);
				 a.add(8);
				 a.add(9);
				 System.out.println(a);
				 System.out.println("NEXT: " +a.remove());
				 System.out.println("NEXT: "+a.remove());
				 System.out.println("NEXT: "+a.remove());
				 System.out.println(a);
				 a.add(10);
				 System.out.println(a);
				 a.add(11);
				 System.out.println(a);
				 a.add(12);
				 System.out.println(a);
				 System.out.println("NEXT: "+a.remove());
				 System.out.println(a);
				 a.add(13);
				 System.out.println(a);
				 a.add(14);
				 System.out.println(a);
				 a.add(15);
				 System.out.println(a);
				 System.out.println("NEXT: "+a.remove());
				 System.out.println(a);
				 

			
		}
	}


