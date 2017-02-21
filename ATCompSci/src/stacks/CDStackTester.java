package stacks;

import java.util.Stack;

public class CDStackTester {

	public static void main(String[] args) throws IntegerOutOfBoundsException {
		// TODO Auto-generated method stub
		
Stack<String>myStack = new Stack<String>();
		
		myStack.push("Journey");
		myStack.push("Iggy Pop");
		myStack.push("Hall & Oats");
		myStack.push("Genesis");
		myStack.push("Foreigner");
		myStack.push("Eagles");
		myStack.push("Deep Purple");
		myStack.push("Cheap Trick");
		myStack.push("Beatles");
		myStack.push("AeroSmith"); 
		CDStack st = new CDStack(myStack);
		Stack<String> temp = new Stack<String>();
		temp.push("Dire Straits");
	System.out.println(	st.binary(12));
		
	}

}
