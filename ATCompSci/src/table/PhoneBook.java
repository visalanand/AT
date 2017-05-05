package table;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
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
		TreeSet <String> set = hash.keySet();
	}
	
}
