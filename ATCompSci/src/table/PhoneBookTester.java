package table;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneBookTester {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner (new File ("H:\\phone.txt"));
		StringTokenizer str; 
		PhoneBook b = new PhoneBook(100);
		while (scan.hasNextLine()){
			str = new StringTokenizer(scan.nextLine());
			b.add(new PhoneEntry(str.nextToken(), str.nextToken()));
		}
		b.display();
		
		System.out.println("Capacity: " + b.getCapacity() + "\nSize: " + b.getSize() + "\nLongest list length: " + b.getLongestList() + "\nNull entries: " + b.getNumberOfNulls());
		
		
	}

}
