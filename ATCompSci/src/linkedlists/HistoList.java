package linkedlists;
import java.util.*;


public class HistoList
{
   private HistoNode front;

	public HistoList( )
	{
		
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let)
	{
		HistoNode temp = front;
		 boolean isThere = false;
		while (temp != null && !isThere){
			
			if (temp.getLetter() == let){
				isThere = true;
				temp.setLetterCount(temp.getLetterCount()+1);
			}
			temp = temp.getNext();
			
		}
		
		
		if (!isThere){
			HistoNode node = new HistoNode(let,1,front);
			front = node;
		}
	
			
	}
	
	

	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
		int index= 0;
		HistoNode temp = front;
		while(front != null){
			if (let == front.getLetter()){
				front = temp;
				return index;
			}
			index++;
			front = front.getNext();
		}







		return -1;
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		HistoNode current=front;

		for (int x = 0; x<=spot;x++){
			front = front.getNext(); 
			
		}
		HistoNode pos = front;
		front = current;
		return pos;








		
	}

	//returns a string will all values from list
	public String toString()
	{
		if (front.getLetterCount() == 0){
			front = front.getNext();
		}
		
		
		HistoNode temp = front;
		String output = "";
		while(front != null){
			output += "Letter= "+front.getLetter()+" Count= "+front.getLetterCount()+" \n";
			front = front.getNext();
		}
		output +="\n";
		front = temp;
		return output;
	}
}