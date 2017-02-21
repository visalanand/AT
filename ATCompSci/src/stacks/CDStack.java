package stacks;

import java.util.Stack;

import java.util.*;

public class CDStack {
	static Stack<String> myStack;
	static Stack<String> albums;
	
	
	public CDStack(String album1, String album2, String album3){
		albums.push(album1);
		albums.push(album2);
		albums.push(album3);
	}
	
	public CDStack(Stack<String>st){
		myStack = st;
	}
	public String nextCD(){
		return myStack.peek();
	}
	public String playNextCD(){
		return myStack.pop();
	}
	public void printCDs(){
		Stack<String> temp = myStack;
		while (!myStack.isEmpty())
		System.out.println(myStack.pop()+ " ");
		myStack = temp;
	}
	public void printCDs2(){
		Iterator<String> iter  = myStack.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	public void printCDs3(){
		
		for (String s: myStack){
			System.out.println(s);
		}
	}
	public Stack<String> printCDrecursive(Stack<String> temp){
		if (temp== null){
			return null;
		}
		else{
		System.out.println(temp.pop());
		return printCDrecursive(temp);
	
		}}
	public void reverseStack(){
		Stack <String> rev = new Stack<String>();
		while(!myStack.isEmpty())
		rev.push(myStack.pop());
		myStack = rev;
	}
	
	
	public  Stack<String> combineStack(CDStack other){
		Stack<String> newStack = new Stack<String>();
		other.reverseStack();
		Stack<String> temp = other.myStack;
		while (!temp.isEmpty()){
			newStack.push(temp.pop());
		}
		while (!myStack.isEmpty())
		newStack.push(myStack.pop());
		
		return newStack;
		
	}
	
	public String binary(int n) throws IntegerOutOfBoundsException{
		String temp = "";
		if (n>127)
			throw new IntegerOutOfBoundsException("Between 0-127");
		while (n!= 1 || n!=0){
			temp += n%2+"";
			n = n/2;
		}
		return temp.r;
		
		
	}
	

}
