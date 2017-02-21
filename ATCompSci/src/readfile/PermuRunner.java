package readfile;
import java.util.*;
import static java.lang.System.*;

public class PermuRunner
{
   public static void main( String args[] )
   {
	   
	   Permutation pem  = new Permutation ("ABC");
	   Permutation pem2  = new Permutation ("abc");
	   Permutation pem3  = new Permutation ("toad");
	   Permutation pem4  = new Permutation ("me");
	   pem.permutation();
	   System.out.println();
	   
	   
	   pem2.permutation();
	   System.out.println();
	   pem3.permutation();
	   System.out.println();
	   pem4.permutation();
	    //add test cases	    
	}
}