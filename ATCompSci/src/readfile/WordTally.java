package readfile;

import java.util.Comparator;

public class WordTally   {

	public int count;
	public String word;
	public WordTally(int count_, String word_){
		super();
		count = count_;
		word = word_;
	}
	
	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getWord() {
		return word;
	}


	public void setWord(String word) {
		this.word = word;
	}


	public void incrementCount(){
		count = count+1;
	}


	
	

	
	
	
}
