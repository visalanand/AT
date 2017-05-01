package table;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import static java.lang.System.*;

public class HashTableRunner {
	public static void main(String[] args) throws FileNotFoundException {
		// try{
		// make a new table
		HashTable hash = new HashTable();
		Scanner scan = new Scanner(new File("H:\\numbers.dat"));
		// read from the file
		while (scan.hasNextLine()) {
			int x = Integer.parseInt(scan.nextLine());
			hash.add(new Number(x));
		}

		// load stuff into the table
		System.out.println(hash.toString());
		// print out the table
	}
	// catch(Exception e)
	// {
	// System.out.println("Houston, we have a problem!");
	// }
}
