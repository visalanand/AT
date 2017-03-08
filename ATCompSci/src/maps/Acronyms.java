package maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Acronyms {
	private Map<String, String> acronymTable;

	public Acronyms() {
		acronymTable = new HashMap<String,String>();
	}

	public String readFile() throws IOException {
		BufferedReader buff = new BufferedReader(new FileReader("H:\\acro.dat"));
		StringTokenizer str = new StringTokenizer(buff.readLine());
		int a = Integer.parseInt(str.nextToken());
		String s = "";
		for (int x = 0; x < a; x++) {
			s = buff.readLine();
			str = new StringTokenizer(s);
			acronymTable.put(str.nextToken(), s.substring(s.indexOf("- ")+2));
		}
		String out = "";
		while (str!= null){
			while (str.hasMoreTokens()){
				String token = str.nextToken();
				if (acronymTable.get(token)!= null)
				{
					out += acronymTable.get(token)+" ";
				}
				else{
					out+= token+" ";
				}
			}
			try{
			str = new StringTokenizer (buff.readLine());
			}catch(Exception E){
				out+="\n";
				break;
			}
			out+="\n";
			
			
			
		}
		
		return out;
		
	}

	

	public String toString() {
		return "";
	}
}