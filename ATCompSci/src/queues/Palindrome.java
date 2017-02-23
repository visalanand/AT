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
		String [] li = {"one", "two", "three", "two", "one"};
		
		String [] li2 = {"1", "2", "3", "4", "5", "one", "two", "three","four","five"};
		String [] li3 = {	"a", "b", "c", "d" ,"e" ,"f" ,"g", "x" ,"y", "z", "g", "f","h"};
//		racecar is racecar
//		1 2 3 a b c c b a 3 2 1
//		chicken is a chicken

		
		
		
		
		Palindrome palin = new Palindrome(li);
		Palindrome palin2 = new Palindrome(li2);
		Palindrome palin3 = new Palindrome(li3);

		System.out.println(palin);
		System.out.println(palin2);
		System.out.println(palin3);
		
	}

}
