package graph;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Graph
{
	
	private boolean yahOrNay;
	Map<Character, String> ar  = new TreeMap<Character, String>();
	public Graph(Map <Character, String> _map)
	{
		ar = _map;
	}

	
	public void readFile(String temp) throws FileNotFoundException
	{
		
		Map<Character , String> map = new TreeMap<Character, String>();
		String token;
		char a , b;
		StringTokenizer str ;
		
			str = new StringTokenizer (temp);
			while ( str.hasMoreTokens()){
				try{
				
			token = str.nextToken();
			a = token.charAt(0);
			b = token.charAt(1);
			if (map.get(a) != null){
				String tempRemove = map.get(a);
				map.remove(a);
				map.put(a, tempRemove+b);
			}
			else if ( map.get(a)== null){
				map.put(a, b+"");
			}
			if (map.get(b) != null){
				String tempRemove = map.get(b);
				map.remove(b);
				map.put(b, tempRemove+a);
			}
			else if ( map.get(b)== null){
				map.put(b, a+"");
			}
			
			
			}	catch(Exception E){
				break;
			}
			}
			
			
		ar = map;
		
	}
		
	
	
	
	public boolean connected (char a , char b,String been){
		if (ar.get(a) == null)
			return false;
		
		
		if(ar.get(a).contains(""+b)){
			return true;
		}
		
		else {
		for ( int x = 0; x<ar.get(a).length();x++){
			if(!been.contains(""+ar.get(a).charAt(x)))
			if (connected(ar.get(a).charAt(x),b,been+ar.get(a).charAt(x))){
				return true;
			}
		}
		return false;
		}
	
		
		
	}

	
	public String toString()
	{
		return "";
	}
	
	
	
	
}