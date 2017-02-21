package linkedlists;

import java.util.LinkedList;

import java.util.ListIterator;


public class LinkedLists{

	
	
	
	
	
	public static void main (String args[]){
		LinkedList<String> roster = new LinkedList<String> ();
		roster.addLast("Priya");
		roster.addLast("Georg");
		System.out.println(roster);
		roster.addLast("Eve");
		roster.addLast("Sieg");
		
		ListIterator<String> iter = roster.listIterator();
		iter.next();
		iter.add("Kurt");
		System.out.println(iter.previous());
		iter.add("Mr.S");
		System.out.println(roster);
		iter.remove();
		
		
		
		
	}
}
