package stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SyntaxChecker {

	String exp = "";
	char [] valuesStart = {'{', '(','<','['};
	char [] valuesEnd = {'}',')','>',']'};
	public SyntaxChecker(String s) {
		exp = s;
	}

	public ArrayList<Character> transferToString(String expression) {
		String[] str = expression.split("");
		ArrayList<Character> ar = new ArrayList<Character>();
		for (String s : str)
			ar.add(s.charAt(0));
		return ar;

	}

	public boolean isCorrect() {
		Stack<Character> vals = new Stack<Character>();
		ArrayList<Character> chars = transferToString(exp);
	//	System.out.println(chars);
		for (Character s: chars){
			if (s  == valuesStart[0]||s  == valuesStart[1]||s  == valuesStart[2]||s  == valuesStart[3])
			vals.push(s);
			else if (s == valuesEnd[0]||s == valuesEnd[1]||s == valuesEnd[2]||s == valuesEnd[3]){
				if (!vals.isEmpty()){
					Character a = vals.pop();
					int index1 = Arrays.binarySearch(valuesStart, a);
					int index2 = Arrays.binarySearch(valuesEnd, s);

					if (index1 == index2){
						
					}
					else{
						return false;
					}
				}
				else
					return false;
			}
		}
		
		if (!vals.isEmpty())
		return false;
		return true;
		
		
		
		
		
		
	}
	
	public String toString (){
		 if (isCorrect()){
			 return exp +" is correct";
		 }
		 else{
			 return exp + " is incorrect";
		 }
		 
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SyntaxChecker test = new SyntaxChecker("(abc(*def)");
		//System.out.println(test.isCorrect());
		System.out.println(test);

		SyntaxChecker test2 = new SyntaxChecker("[{}]");
		System.out.println(test2);

		SyntaxChecker test3 = new SyntaxChecker("[");
		System.out.println(test3);

		SyntaxChecker test4 = new SyntaxChecker("[{<()>}]");
		System.out.println(test4);

		SyntaxChecker test5 = new SyntaxChecker("{<html[value=4]*(12)>{$x}}");
		System.out.println(test5);

		SyntaxChecker test6 = new SyntaxChecker("[one]<two>{three}(four)");
		System.out.println(test6);

		SyntaxChecker test7 = new SyntaxChecker("car(cdr(a)(b)))");
		System.out.println(test7);

		SyntaxChecker test8 = new SyntaxChecker("car(cdr(a)(b))");
		System.out.println(test8);

		

	}

}
