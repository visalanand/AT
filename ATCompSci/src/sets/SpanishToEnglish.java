package sets;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public class SpanishToEnglish
{
	private Map<String,String> pairs;

	public SpanishToEnglish()
	{

		

	}

	public String read() throws FileNotFoundException
	{
		pairs = new TreeMap<String, String>();
		Scanner scan = new Scanner (new File("H:\\spantoeng.dat"));
		StringTokenizer token = new StringTokenizer (scan.nextLine());
		int num = Integer.parseInt(token.nextToken());
		
		for (int x = 0; x<num;x++){
			token = new StringTokenizer(scan.nextLine());
			pairs.put(token.nextToken(), token.nextToken());
		}
		String n = "";
		token = new StringTokenizer(scan.nextLine());
		while ( token!= null){
			while (token.hasMoreTokens()){
			n+= pairs.get(token.nextToken())+" ";
			}
			n+= "\n";
			try {
				token = new StringTokenizer(scan.nextLine());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				break;
			}
			
			
			
		}
			
		
		
		
		return n;
		





	}

	public String translate(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";






		return output;
	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}