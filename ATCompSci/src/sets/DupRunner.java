package sets;
import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
	public static void main( String args[] )
	{
		String a = "abcdefghijklmnde";
		System.out.println("Original List: "+ a);a
		System.out.println("Uniques: "+UniquesDupes.getUniques(a));
		System.out.println("Duplicates: "+ UniquesDupes.getDupes(a));
	}
}