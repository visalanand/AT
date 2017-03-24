package sets;

import java.util.HashMap;
import java.util.Map;

public class Histogram
{
	String sent_;
	private Map<String,Integer> histogram;

	public Histogram()
	{
	}

	public Histogram(String sent)
	{
		histogram = new HashMap<String,Integer>();
		setSentence(sent);
		sent_ = sent;
	}
	
	public void setSentence(String sent)
	{
		String[] ab = sent.split(" ");
		for (String s: ab){
			try {
				histogram.put(s, histogram.get(s)+1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				histogram.put(s,1);

			}
			
		}
	}

	public String toString()
	{
		String [] str = sent_.split(" ");
		String output = "";
		for ( int x =0; x< histogram.size();x++){
			if (histogram.get(str[x]) != null){
				output += str[x]+ " "+ histogram.get(str[x])+"\n";
				histogram.remove(str[x]);
			}
		}
		
		return output+"";
	}
}