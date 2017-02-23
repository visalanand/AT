package sets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;
	
	public OddEvenSets()
	{
	}

	
	public ArrayList<String> readFile(String line) throws FileNotFoundException{
		Scanner scan  = new Scanner (new File(line));
		ArrayList<String> ar = new ArrayList<String>();
		while (scan.hasNextLine()){
			ar.add(scan.nextLine());
		}
		return ar;
		
	}
	
	public OddEvenSets(String line) throws FileNotFoundException 
	{
		
		evens = new TreeSet <Integer>();
		odds = new  TreeSet <Integer>();
		ArrayList<String> ar = readFile (line);
		
		while (!ar.isEmpty()){
			sortOddsEvens (ar.get(0));
			ar.remove(0);
		}
		
	}
	public void sortOddsEvens(String line){
		String [] chars = line.split(" ");
		for (String a: chars){
			if (Integer.parseInt(a)%2 == 0){
				evens.add(Integer.parseInt(a));
			}
			else{
				odds.add(Integer.parseInt(a));
			}
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}