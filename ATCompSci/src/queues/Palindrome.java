package queues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
	Object [] list ;
	
	public Palindrome(Object[] _list){
		list = _list;
	}
	
	
	public boolean isPalindrome(){
		Queue<Object>  palin = new LinkedList<Object>();
		Stack<Object> palinStack = new Stack<Object>();
		
		for(Object a : list){
			palin.offer(a);
		}
		for (Object b:list){
			palinStack.push(b);
		}
		
		while (!palin.isEmpty()){
			
			if (!(palinStack.pop().equals(palin.poll())))
				return false;
				
			
			
		}
		return true;
		
		
		
		
	}
	
	public String toString (){
		
		if (isPalindrome()){
			return Arrays.toString(list) + " is a palindrome";
		}
		else{
			return Arrays.toString(list) + " is not a palindrome";
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] li = {"abc","def","abc"};
		Palindrome palin = new Palindrome(li);
		
		System.out.println(palin);
		
		
	}

}
