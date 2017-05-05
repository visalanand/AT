package table;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

	LinkedList<PhoneEntry> phone = new LinkedList<PhoneEntry>();
	
	//Name and Number 
	Map<String,String> hash = new Hashtable<String,String>();
	public PhoneBook(){
		
	}
	public PhoneBook(int _numSlots){
		
	}
	public void add (Object o){
		//Cast to PhoneEntry class to get Strings
		PhoneEntry op = (PhoneEntry)o;
		hash.put(op.name, op.number);
	}
	public void display (){
		Set <String> set = hash.keySet();
		Iterator<String> iter = set.iterator();
		for (int x = 0; x<hash.size();x++){
			String n = iter.next();
			System.out.println(n +"\t"+ hash.get(n)); 
		}
		
	}
	
}
