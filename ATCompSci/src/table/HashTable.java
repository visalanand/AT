package table;
import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
		table = new LinkedList[10];
	}

	public void add(Object obj)
	{
		System.out.println("add");
		int i = obj.hashCode();
		System.out.println("hash");
		table[i%10].add(new Number(i));




	}

	public String toString()
	{
		String output="HASHTABLE\n";
		for (LinkedList n : table){
			output+= n.toString()+"\n";
		}
		

		return output;
	}
}