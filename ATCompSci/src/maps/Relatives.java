package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Relatives {
	private Map<String, Set<String>> map;
	private int size = 0;
	BufferedReader br;

	public Relatives() throws IOException {

		map = new HashMap<String, Set<String>>();
		br = new BufferedReader(new FileReader("H:\\relatives.dat"));

	}

	public String readFileAndPrintRelatives() throws IOException {

		StringTokenizer str = new StringTokenizer(br.readLine());
		size = Integer.parseInt(str.nextToken());
		str = new StringTokenizer(br.readLine());
		String person, related;
		for (int x = 0; x < size - 1; x++) {
			person = str.nextToken();
			related = str.nextToken();
			if (map.get(person) == null) {
				Set<String> tree = new TreeSet<String>();
				tree.add(related);
				map.put(person, tree);
			} else {
				Set<String> temp = map.get(person);
				temp.add(related);
				map.remove(person);
				map.put(person, temp);
			}

			str = new StringTokenizer(br.readLine());
		}

		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		String a ="";
		String out = "";
		while(iter.hasNext()){
			a = iter.next();
			out += a + " relatives are "+ map.get(a)+"\n";
			
		}
			
			
		

		return out;

	}

	public String getRelatives() throws IOException {
		String s = br.readLine();
		String n = "";
		while (s != null) {

			n += s + " relatives are " + map.get(s) + "\n";

			s = br.readLine();
		}

		return n;
	}

	public String toString() {
		String output = "";

		return output;
	}
}