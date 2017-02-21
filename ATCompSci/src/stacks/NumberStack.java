package stacks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class NumberStack {
	static Stack<Integer> values = new Stack<Integer>();
	static Stack<String> operators = new Stack<String>();
	static double value;
	static boolean [] values2 = new boolean [4];
	
	public NumberStack() {

	}

	// public int pemdas (char a , char b){
	//
	//
	//
	//
	//
	//
	// }
	public static double resolve(String expression){
		return StackTes.returnNum(expression);
	}
	public static boolean checkStack(char c){
		ListIterator<String> iter = operators.listIterator();
		
		boolean [] values = new boolean [4];
		int index2 = -1;
		switch (c){
		case '+': 
			index2 = 0;
		values2[0] = true;
		break;
		case'-':
			index2 = 0;
		values2[0] = true;
		break;
		case '*': 
			index2 = 1;
			values2[1] = true;
			break;
		case'/':
			index2 = 1;
			values2[1] = true;
			break;
		case '^': 
			index2 = 2;
				values2[2] = true;
				break;
		case'(':
			index2 = 3;
				values2[3] = true;
				break;
		case ')':
			index2 = 3;
			values2[3] = true;
			break;
		
		}
		
		
		while (iter.hasNext()){
			char a = iter.next().charAt(0);
			int index = -1;
			switch (a){
			case '+': 
			values[0] = true;
			index =0;
			break;
			case'-':
			values[0] = true;
			index =0;
			break;
			case '*': 
				values[1] = true;
				index =1;
				break;
			case'/':
				values[1] = true;
				index =1;
				break;
			case '^': 
					values[2] = true;
					index =2;
					break;
			case'(':
					values[3] = true;
					index =3;
					break;
			case ')':
				values[3] = true;
				index =3;
				break;
			
			}
			if (index > index2){
				return true;
			}
			
			
			
		}
		return false;
		
	}

	public static double translateExpression(String expression) {
		Iterator<String> iter = operators.iterator();
		resolve(expression);
		while (!expression.equals("")) {
			if ((int)expression.charAt(0) >48)
				
			if (expression.charAt(0) == ' ')
				expression = expression.substring(1, expression.length());

			if ((int) expression.charAt(0) < 48 || (int) expression.charAt(0) == 94) {
				
				if (checkStack(expression.charAt(0))){
					Iterator<Integer> iter2 = values.iterator();
					iter = operators.iterator();
					while (iter2.hasNext() && iter.hasNext()){
						if (iter.next().equals('+'))
							value += iter2.next()+iter2.next();
					
					if (iter.next().equals('-'))
						value += iter2.next()-iter2.next();
				
				if (iter.next().equals('*'))
					value += iter2.next()*iter2.next();
			
			if (iter.next().equals('/'))
				value += iter2.next()/iter2.next();
		
		if (iter.next().equals('^'))
			value += Math.pow(iter2.next(), iter2.next());
	
	


				}
				operators.push(expression.charAt(0) + "");
				expression = expression.substring(1, expression.length());
				
			} else if ((int) expression.charAt(0) > 48) {
				String s = "";
				while ((int) expression.charAt(0) > 48) {
					s += expression.charAt(0) + "";
					expression = expression.substring(1, expression.length());

				}
				values.push(Integer.parseInt(s));
			}
		}
		
		}
		return value;
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

//	public void calculateExpression(String expression) {
//		if ((int) expression.charAt(0) < 48 || (int) expression.charAt(0) == 94) {
//			
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(resolve("4+2*3-8"));
		System.out.println(resolve("10/5+2*10"));
		System.out.println(resolve("50/10+2*10"));
		System.out.println(resolve("3*(2+1)-3"));
	}

}
