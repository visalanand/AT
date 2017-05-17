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
	Map<Integer,LinkedList<PhoneEntry>> hash = new Hashtable<Integer,LinkedList<PhoneEntry>>();
	public PhoneBook(){
		
	}
	int capacity = 0;
	public PhoneBook(int _numSlots){
		for ( int x= 0; x<_numSlots;x++){
			hash.put(x, new LinkedList<PhoneEntry>());
		}
		capacity = _numSlots;
		
		
	}
	public int getCapacity(){
		return capacity;
	}
	
	public int getNumberOfNulls(){
		Set<Integer> key = hash.keySet();
		Iterator <Integer> it = key.iterator();
		int num = 0; 
		for ( int x =0; x<key.size();x++ ){
			if (hash.get(it.next()).size() == 0){
				num++;
			}
		}
		return num;
	}
	public void add (Object o){
		//Cast to PhoneEntry class to get Strings
		PhoneEntry op = (PhoneEntry)o;
		if (hash.get(Integer.parseInt(op.number)%100) != null){
			LinkedList<PhoneEntry> lin = hash.get(Integer.parseInt(op.number)%100);
			lin.add(op);
			hash.remove(Integer.parseInt(op.number)%100);
			hash.put(Integer.parseInt(op.number)%100, lin);
			
		}
	}
	public void display (){
		Set <Integer> set = hash.keySet();
		Iterator<Integer> iter = set.iterator();
		LinkedList<PhoneEntry> ph;
		System.out.println("Name\tBucket#\tNumber");
		for (int x = 0; x<hash.size();x++){
			Integer n = iter.next();
			ph = hash.get(n);
			for ( int a = 0; a<ph.size();a++){
				System.out.println(ph.get(a).name+"\t"+n+"\t"+ph.get(a).number);
			}
			
		}
		
	}
	
	public int getSize(){
		return hash.keySet().size();
	}
	public void changeNumber(PhoneEntry ph){
		LinkedList<PhoneEntry> lin = hash.get(Integer.parseInt(ph.number)%100);
		
		for ( int x = 0; x< lin.size();x++){
			if (ph.name.equals(lin.get(x).name)){
				lin.remove(lin.get(x));
			}
			hash.remove(Integer.parseInt(ph.number)%100);
			lin.add(ph);
			hash.put(Integer.parseInt(ph.number)%100, lin);
		}
		
	}
	public int getLongestList(){
		int min = Integer.MIN_VALUE;
		Set<Integer> set = hash.keySet();
		Iterator<Integer> iter = set.iterator();
		int temp = 0;
		for ( int x = 0; x<set.size();x++){
			temp = iter.next();
			if (min< hash.get(temp).size()){
				min = hash.get(temp).size();
			}
		}
		return min;
	}
	
	
}
