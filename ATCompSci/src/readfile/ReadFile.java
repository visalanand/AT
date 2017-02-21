package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
	
	static ArrayList<WordTally> wordTally = new ArrayList<WordTally>();
	static ArrayList<String> sentenceArray = new ArrayList<String>();
	String line;
	public ReadFile()
    {
		 
        File file = new File("dream.txt");
try { 
   
           
    Scanner inFile = new Scanner(file);
       
    while (inFile.hasNext()) 
    {         
        line = inFile.next();
        line = line.toLowerCase();
        line = line.replaceAll("[!;,:.?'\"-]", "");
        line = line.trim();
    
        
      if ( contains (line, wordTally)>-1){
    	  
    	  wordTally.get(contains(line,wordTally)).incrementCount();
    	 
    	  
      }
      
      else{
    	wordTally.add(new WordTally(1,line));  
      }
//     line =  line.replaceAll(",", "");
//       
//
//      line = line.replaceAll(".", "");

        sentenceArray.add(line);
    }
    
    
    
    
} catch (FileNotFoundException e) {   
	System.out.println("File not found"); 

        e.printStackTrace(); 
}
}

	
	
	
	
	public void insert(String line){
		wordTally.add(new WordTally(1,line));
		
		
	}
	
	
	
	
	
	public int contains(String line , ArrayList<WordTally>ar){
		
		
		for ( int x =0 ; x< ar.size();x++){
			if ( line.equals(ar.get(x).getWord())){
				return x;
			}
			
		}
		return -1;
		
		
		
	}
	
	


public static ArrayList<WordTally> sort(ArrayList<WordTally> arr){
    WordTally temp;
    for(int i=0; i < arr.size()-1; i++){

        for(int j=1; j < arr.size()-i; j++){
            if(arr.get(j-1).getCount() > arr.get(j).getCount()){
                temp=arr.get(j-1);
                arr.set(j-1,arr.get(j));
                arr.set(j, temp); 
            }
        }
       
    }
    return arr;
}




public static void main (String args[]){
	

	

	ReadFile readFile = new ReadFile();
	
	

	ArrayList<WordTally>ar = sort(wordTally);
		System.out.println("Number of Unique Words = "+ wordTally.size());
		System.out.println("Number of Words = "+sentenceArray.size());
		
		
		System.out.println("Top 30 Words:");
		System.out.println("Word\tCount");
		
		for ( int a = ar.size()-1; a> ar.size()-30;a--){
			System.out.println(ar.get(a).getWord()+"\t"+ar.get(a).getCount());
			
		}
//		
//
//	
}





}







	
	



	
	
	
	
	

