package table;

import java.util.LinkedList;

public class HashTableWord {
	private LinkedList<Word>[] table;

	public HashTableWord() {
		table = new LinkedList[10];
		for (int x= 0; x<table.length;x++){
			table[x] = new LinkedList<Word>();
		}

	}

	public void add(Word obj) {
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

