package sets;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.System.*;

public class PartList {
	private TreeMap<Part, Integer> partsMap;

	public PartList() {

	}

	public PartList(String fileName) {
		partsMap = new TreeMap<Part, Integer>();
		try {
			Scanner file = new Scanner(new File("H:\\" + fileName));
			// add code here to read from the file
			// and add Parts to the map
			StringTokenizer str = new StringTokenizer(file.nextLine());
			String partName = "";
			String token;
			boolean isDone = false;
			while (file.hasNextLine()) {
				while (str.hasMoreTokens() && !isDone) {
					token = str.nextToken().toLowerCase();
					if (token.charAt(0) < 58 && token.charAt(0) > 47)
						isDone = true;
					partName += token + " ";
				}
				
				Part part;
				String make, model;
				int year;

				if (isDone) {

					make = str.nextToken();
					model = str.nextToken();
					year = Integer.parseInt(str.nextToken());
					part = new Part(make, model, partName, year);
					try{
						
					partsMap.put(part, partsMap.get(part)+1);
					}catch(Exception E){
						partsMap.put(part,1);
					}
				}
				partName = "";
				isDone = false;
				str = new StringTokenizer(file.nextLine());
			}

		} catch (IOException e) // Most specific exceptions must be listed 1st
		{
			out.println(e);
		} catch (RuntimeException e) {
			out.println(e);
		} catch (Exception e) {
			out.println(e);
		} finally {
			// no code needed here
		}
	}

	public String toString() {
		
		String s = "";
		for (Part n: partsMap.keySet()){
			s+= n.getMake()+" "+n.getMode()+ " "+n.getRest()+"="+ partsMap.get(n)+"\n";
		}
		return s;
	}
}