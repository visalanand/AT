package readfile;
import java.util.*;
import static java.lang.System.*;

public class Permutation
{
	private String orig;
	private String list;

	public Permutation(String word)
	{
		orig=word;
		list="";
	}

   public void permutation()
   {
   	out.println("\nPERMUTATION OF WORD :: "+orig);
   	permutation(orig,"");
   }

	private void permutation(String orig, String sent)
	{
		
		
		if ( sent .length() == orig.length()){
			System.out.println(sent);
	} else {
		for ( int x = 0; x< orig.length();x++){
			if ( sent.indexOf(orig.charAt(x) )== -1)
				
				permutation(orig,orig.charAt(x)+sent);
		}
		
		
		
	}
		

		










	}

   public String toString()
   {
   	return list;
   }
}