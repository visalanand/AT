package stacks;
import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
	private Stack<String> stack;

	public StackTest()
	{
		
		setStack("");
	}

	public StackTest(String line)
	{
		setStack(line);
	}
	
	public void setStack(String line)
	{
		stack  = new Stack<String>();
		String [] st = line.split(" ");
		for (String s  : st){
			stack.push(s);
		}
	}

	public void popEmAll()
	{
		Stack<String> newStack = Stack<String>();
		stack = newStack;
	}
	public static Stack<Card> reverseStack(Stack<Card> other){
		Stack <Card> rev = new Stack<Card>();
		while(!other.isEmpty())
		rev.push(other.pop());
		return rev;
	}
	public String toString (){
		reverseStack();
		return stack+"";
	}
	//add a toString
}