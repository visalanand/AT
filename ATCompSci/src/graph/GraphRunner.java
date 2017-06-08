package graph;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -  

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

import static java.lang.System.*;

public class GraphRunner {
	public static void main(String[] args) throws IOException {
		Graph graph = new Graph (null);
		
		Scanner file = new Scanner(new File("H:\\graph1.dat"));
		int x = Integer.parseInt(file.nextLine())	;
		String n;
		while (file.hasNextLine()){
			graph.readFile(file.nextLine());
			if (file.hasNextLine())
			 n= file.nextLine();
			else {
				break;
			}
			System.out.println(n.charAt(0)+" is Connected to "+n.charAt(1)+" === "+graph.connected(n.charAt(0), n.charAt(1),""));
		}
		
		
		
		
	}
}