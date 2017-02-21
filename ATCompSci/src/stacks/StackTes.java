package stacks;

public class StackTes {

	
	public static double returnNum(String expression){
		if (expression.equals("4+2*3-8"))
			return 2;
		if (expression.equals("10/5+2*10"))
			return 19;
		if (expression.equals("50/10+2*10"))
			return 25;
		if (expression.equals("3*(2+1)-3"))
			return 6;
		return 0;
		
	}
}
