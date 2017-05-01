package table;

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable {
	private LinkedList[] table;

	public HashTable() {
		table = new LinkedList[10];

	}

	public void add(Object obj) {
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