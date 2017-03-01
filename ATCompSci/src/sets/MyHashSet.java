package sets;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSet {
	public LinkedList<Integer> linked;

	public MyHashSet() {
		linked = new LinkedList<Integer>();
	}
	
	public int size (){
		return linked.size();
	}
	
	public boolean contains(Coin coin){
			for (int x =0; x<linked.size();x++){
				if (linked.get(x) == coin.hashCode()){
					linked.remove(x);
					return true;
				}
			}
			return false;
	}

	public boolean add(Coin coin) {

		if (!linked.contains(coin.hashCode())) {

			linked.add(coin.hashCode());
			return true;

		}
		return false;

	}
	
	
	public boolean remove (Coin coin){
		
		if (linked.contains(coin.hashCode())){
			linked.remove(coin.hashCode());
			return true;
		}
		return false;
		
	}
	
	
	
		
	}
	


