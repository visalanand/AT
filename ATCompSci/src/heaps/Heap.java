package heaps;
import java.util.ArrayList;
import static java.lang.System.*;

public class Heap
{
	private ArrayList<Integer> list;

	public Heap()
	{
		list = new ArrayList<Integer>();
	}

	public void add(int value)
	{
		list.add(value);
		swapUp(list.size()-1);
	}

   public void swapUp(int bot)
   {
	}

	public void remove( )
	{
		list.set(0,list.get(list.size()-1));
		list.remove(list.size()-1);
		swapDown(list.size());
	}

	public void swapDown(int top)
	{
	}
	
	private void swap(int start, int finish)
	{	
	}

	public void print()
	{
		out.println("\n\nPRINTING THE HEAP!\n\n");
		out.println();
	}

	public String toString()
	{
		return list.toString();
	}
}