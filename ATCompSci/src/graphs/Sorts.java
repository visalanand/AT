package graphs;
import java.util.Random;

public class Sorts {

	private int[] nos;
	public int steps;
	public static long nanoTime;
	// Constructs a default array of size 10
	public Sorts() {
		nos = new int[10];
		nos[0] = -10001;
		nos[1] = 3;
		nos[2] = 7;
		nos[3] = 19;
		nos[4] = 15;
		nos[5] = 19;
		nos[6] = 7;
		nos[7] = 3;
		nos[8] = 19;
		nos[9] = -100;

	}

	public Sorts(int[] temp) {
		nos = temp;
	}

	// Constructs an array with size random Sorts from [0,range)
	public Sorts(int size, int range) {

	}

	// Constructs an array of random Sorts [0-range) array of size count with a
	// seed
	// The seed allows you to use the same set of random numbers

	public Sorts(int count, int range, long seed) {

	}

	// This constructor will create an ordered array of consecutive integers
	// true will yield ascending order
	// false will yield descending order
	public Sorts(int count, boolean ordered) {

	}

	public int getSteps() {
		return steps;
	}

	public void display() {
		for (int x : nos)
			System.out.print(x + " ");
		System.out.println();
	}

	public int[] getNos() {
		return nos;

	}

	public void swap(int x, int y) {
		int temp = nos[x];
		nos[x] = nos[y];
		nos[y] = temp;
		steps += 3;
	}

	public void bubbleSort() {
		
		
		//Consecutive values are compared and swapped if necessary
		steps = 0;
		boolean swapped = true;
		steps++;
		int lastSwap = nos.length - 1;
		steps++;
		int temp = 0;
		steps++;
		steps++; // initialize for loop
		for (int i = 0; i < nos.length; i++) {
			steps += 3; // boundary check, increment,if
			if (swapped) {
				swapped = false;
				steps++;
				steps++; // initialize for loop
				for (int j = 0; j < lastSwap; j++) {
					steps += 3; // boundary check, increment,if
					if (nos[j] > nos[j + 1]) {
						swap(j, j + 1);
						swapped = true;
						steps++;
						temp = j;
						steps++;
					}
				}
				lastSwap = temp;
				steps++;
			}

		}
		nanoTime = System.nanoTime();
	}
	
	
	
	public static void InsertionSort( int [ ] num)
	{
	     int j;                     // the number of items sorted so far
	     int key;                // the item to be inserted
	     int i;  

	     for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
	    {
	           key = num[ j ];
	           for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)   // Smaller values are moving up
	          {
	                 num[ i+1 ] = num[ i ];
	          }
	         num[ i+1 ] = key;    // Put the key in its proper location
	     }
	     nanoTime = System.nanoTime();
	}

	
	public static void SelectionSort ( int [ ] num )
	{
	     int i, j, first, temp;  
	     for ( i = num.length - 1; i > 0; i-- )  
	     {
	          first = 0;   //initialize to subscript of first element
	          for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
	          {
	               if( num[ j ] < num[ first ] )         
	                 first = j;
	          }
	          temp = num[ first ];   //swap smallest found with element in position i.
	          num[ first ] = num[ i ];
	          num[ i ] = temp; 
	      }           
	     
	     nanoTime = System.nanoTime();

	}
	
	
	
	
	public static int[] randArray (int seed, int length){
		int [] temp = new int[length];
		Random rand = new Random (seed);
		for ( int x = 0; x<temp.length;x++){
			temp[x] = rand.nextInt(100);
		}
		return temp;
	}
	
	
	
	public static void main(String[] args) {
			//int [] arr = { 1,2,3,4,5,6,7,8,9};
			//int [] arr = { 9,8,7,6,5,4,3,2,1};
			int [] arr = { 2,5,4,7,9,1,3,8,6};
			long nanoStart;
			
			for ( int x = 0; x<8;x++){
				int [] ar = randArray(1,8+x);
				
				Sorts one = new Sorts(ar);
				nanoStart = System.nanoTime();
				Sorts.SelectionSort(ar);
				long num  = one.nanoTime - nanoStart;
				int a = 8+x;
				System.out.println("Length " + a + " Time: "+ num);
				
			}
			
			
			
		
		//StopWatch timer = new StopWatch();
		
		
		
		//timer.stop();
//		one.display();
//		System.out.println("Default Array Steps:     " + one.getSteps());
	
	//	System.out.println("Default Array time: " + timer.getElapsedTime()+ " milliseconds.");
		
				//This is a sample code for testing bubble sort  for data in  reverse order
		//Sorts two = new Sorts (100000,false);
		// timer.reset();
		// timer.start();
		// two.bubbleSort();
		// timer.stop();
		// two.display();
		// System.out.println("Reverse order Steps: " + two.getSteps());
		// System.out.println("Reverse order time: " + timer.getElapsedTime()+ "
		// milliseconds");
		// System.out.println();

	}
}
