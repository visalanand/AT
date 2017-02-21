package readfile;

public class Recursive {

	
	
	
	
	
	public static int recursiveGetMax(int [][] td, int x ){

		if (x+1 > td.length)
			return 0;
			
		
		return sum(td[x],0) + recursiveGetMax(td,x+1);
		
	
	}
	
	
	
	public static int sum(int [] y, int x){
		if (x+1 > y.length)
			return 0;
		
		
		return y[x]+ sum(y, x+1);
		
		
		
		
		
	}
	
	
	public static void main (String args[]){
		
		int [][] al = {{1,2,3},{ 4,5,6},{7,8,9}};
		
		System.out.println(recursiveGetMax(al,0));
		
	}
	
	
}
