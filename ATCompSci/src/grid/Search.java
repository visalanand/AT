package grid;

import java.util.Arrays;

public class Search {

	
	
	
	public static int linearSearch(int [] x,int y){
		
		int index = -1; 
		for (int a  = 0; a< x.length;a++){
			if (x[a] == y)	{
				index = a;
				break;
			}
			
			
		}
		return index;
		
	}
	
	
	public static int binSearch(int []x , int y){
		int first = 0, last = x.length-1, mid = last/2;
		int index = -1; 
		boolean ind = false;
		while ( !ind && first<last){
			if ( x[mid] == y){
				index = mid;
				break;
			}
			else if ( y< x[mid]){
				last = mid -1;
			}
			else{
				first = mid+1;
				mid = (first+last)/2;
			}
		}
		
		return index;
		
		
	}
	
	
	
	
	public static void main (String args[]){
		int [] array = {1,2,3,4,5,6};
		Arrays.sort(array);
		System.out.println(binSearch(array, 3));
		
		
	}
}
