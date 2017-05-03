package table;


public class Word
{
	private String theValue;
	
	//write a constructor method
	public Word(String val){
		theValue = val;
	}
	
	
	
	//write the getValue method
	public String getValue(){
		return theValue;
	}
	
	
	//write the equals method
	public boolean equals (Word h){
		return theValue.equals(h.theValue);
	}
	
	
	//write the hashCode method
	public int hashCode (){
		String n = theValue;
		int count = 0;
		for (int x = 0; x<theValue.length();x++){
			if (theValue.charAt(x) == 'a'||theValue.charAt(x) == 'i'||theValue.charAt(x) == 'o'||theValue.charAt(x) == 'u'){
				count++;
			}
		}
		return (count*theValue.length())%10;
	}
	
	
	//write the toString method
	public String toString(){
		return theValue + "";
	}
	
}