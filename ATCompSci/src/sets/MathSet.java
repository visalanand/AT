
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
	}

	public MathSet(String o, String t)
	{
	}

	public Set<Integer> union()
	{
		Set<Integer> combined = new TreeSet<Integer>(one);
		combined.addAll(two);
		return combined;
	}

	public Set<Integer> intersection()
	{
		return null;
	}

	public Set<Integer> differenceAMinusB()
	{
		return null;
	}

	public Set<Integer> differenceBMinusA()
	{
		return null;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer>a = differenceAMinusB();
		Set<Integer>b = differenceBMinusA();
		Set<Integer> added = new TreeSet<Integer>(a);
		added.addAll(b);
			
		
		return added;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}