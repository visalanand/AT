package table;

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable {
	private LinkedList<Number>[] table;

	public HashTable() {
		table = new LinkedList[10];
		for (int x= 0; x<table.length;x++){
			table[x] = new LinkedList<Number>();
		}

	}

	public void add(Number obj) {
		int i = obj.hashCode();
		table[i].add(obj);
	}

	public String toString() {
		String output = "HASHTABLE\n";
		int counter = 0;
		for (LinkedList n : table) {
			output += counter + "\t" + n.toString() + "\n";
			counter++;
		}

		return output;
	}
}