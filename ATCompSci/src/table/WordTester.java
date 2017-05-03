package table;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordTester
{
	public static void main(String[] args) throws FileNotFoundException
	{
		HashTableWord hash = new HashTableWord();
		Scanner scan = new Scanner(new File("H:\\words.dat"));
		// read from the file
		scan.nextLine();
		while (scan.hasNextLine()) {
		
			hash.add(new Word(scan.nextLine()));
		}

		// load stuff into the table
		System.out.println(hash.toString());
		// print out the table
	}
	}
