package readfile;

public class RecursiveMethodsAT {

/** 

 * 1. Recursively find and return 

 * the product of the first y whole numbers. 

 * 

 * @param y 

 * @return  y! as a long integer 

 * 

 * @ 

 */ 

public static long factorial(int y) { 
	if (y==1){
		return 1;
	}
	else {
		return y * factorial(y-1);
	}
} 

/** 

 * 2. Recursively find and return 

 * the sum of the first y whole numbers. 

 * 

 * @param y 

 * @return sum as an int 

 */ 

public static int sumInt(int y) { 
	if (y==1){
		return 1;
	}
	else {
		return y + sumInt(y-1);
	}
} 

/** 

 * 3. Recursively finds the value of 2 to the yth power 

 * @param y 

 * @return 2^y as a long integer 

 */ 

public static long powerOfTwo(int y) { 
	if (y==1)
		return y;
	return 2* powerOfTwo(y-1);
} 

/** 

 * 4. Recursively find the nth term of the Fibonacci Sequence 

 * 1,1,2,3,5,8,13....... 

 * 

 * @param n 

 * @return nth term as an int 

 */ 

public static int fib(int n) 
{ 
	
	if ( n == 0){
	return 0;	
	}
	
	if ( n == 1)
		return 1;
	if ( n== 2)
		return 1;
	
	return   fib(n-2) + fib(n-1) ; 
	
	
		
	}
	
	
	
	
	


/** 

 * 5. Recursively finds and returns the sum of the digits of n 

 * @param n 

 * @return 

 */ 

public static int sumDigits(int n) { 
	if ( n < 10){
		return n;
	}
	
	
	
	return n%10 + sumDigits (n/10);
} 

/** 

 * 6. Recursively find and return the reverse of a String s 

 * @param s 

 * @return the reverse of s 

 */ 

public static String reverse(String s) { 

	if (s.length() <= 1){
		return s;
	}
	
	return s.charAt(s.length()-1) +  reverse(s.substring(0, s.length()-1));
	
	
} 

/** 

 * 7. Recursively the sum of the first y terms of the binary series. 

 * 1/2 + 1/4 + 1/8+ ... 

 * @param y the number of terms of the sequence 

 * @return the sum of y terms as a double 

 */ 

public static double binarySeries(int y){ 

	if ( y <= 1){
		return (double)1/((double)2*y);
	}
	return (double)1/((double)2*y) + binarySeries(y-1);
	
	
	
	
	
} 






/** 

 * 8. Recursively finds the maximum element of an array 

 * @param arr 

 * @return   the maximum element in the array 

 */ 

public static int maxValue(int[] arr) {

	if (arr.length<=1){
		
		return arr[0];
		
		
	}
	
	if ( arr[0] < arr[1]){
		int [] ar = new int [arr.length-1]; 
		for ( int x = 1; x< ar.length;x++){
			ar[x-1]=arr[x];
				
		}
		return maxValue(ar);
	}
	
	if (arr[1] <= arr[0]){
		int [] ar = new int [arr.length-1];
		int index=0;
		for (int x=0;x<ar.length;x++){
			if (arr[index]==arr[1]){
				index+=1;
			}
			ar[x]=arr[index];
			index++;
		}
		return maxValue(ar);
	}
	return 0;
	
	
} 

/** 

 * 9. Recursively finds the sum element of an int array 

 * @param arr 

 * @return   the sum of the elements in the array 

 */ 

public static int findSum(int[] a) { 

	if ( a.length<= 1){
		return a[0];
	}
	
	int [] dankArray = new int[a.length-1];
	for ( int x = 0; x< dankArray.length; x++){
		dankArray[x] = a[x];
	}
	
	
	return a[a.length-1] + findSum(dankArray);
	
	
	
} 

/** 

 * 10. Recursively finds the index number of lookFor in an array 

 * @param arr 

 * @return   the index number of lookFor.   -1 if not found 

 */ 

public static int search(int[] arr, int lookFor, int count) { 
if (arr[0] == lookFor){
	return 0;
}

else if (arr.length==1)
	return -count;

int [] memes = new int [arr.length-1];
for ( int x= 1; x<arr.length;x++ ){
	memes[x-1] = arr[x];
	
}

return 1 + search(memes,lookFor,count);

}

/**
 * 11. Recursively finds and returns the sum of a 2DIM array
 * @param array
 * @return   sum as an int
 */

public static int sumOfArray(int[][] array)
{
	
	if ( array.length == 1){
		return findSum(array[0]);
	}
	
	int [][] temp = new int[array.length-1][array[0].length];
	
	for (int x=1;x<array.length;x++){
		temp[x-1]=array[x];
	}
	
	return findSum(array[0]) + sumOfArray(temp);
}




/**
 * 12. recursively fills a 2Dim array with the chararacter c
 * @param array
 * @param c
 */
public static void fillArray2(char[][] array, char c,int index) {
	//if (array.length==1 && array[0].length==1){
	if ( index > array.length-1){
	}
		
	else{
		
		for ( int x = 0; x< array[index].length;x++){
		array[0][x] = c;
		System.out.print(array[0][x]);
		}
		System.out.println();
		
		 fillArray2(array,c,++index);
	}

}
public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println(" 20! "+ factorial(20));
	
	System.out.println("Sum of first 16 Positive integers: " + sumInt(16));
	
	System.out.println("2^12: "+ powerOfTwo(12));
	System.out.println("12th Fibonacci number: " + fib(12));
	System.out.println("Digit Sum of 12345: " + sumDigits(12345));
	System.out.println("RACECAR reversed: " + reverse("RACECAR"));
	System.out.println("Sum of 5 terms of binary Series: "+ binarySeries(4));
	int[] x = { 1, 22, 133, 34, 56, 62, 79 };
	//System.out.println();
	System.out.println("MaxValue: " +maxValue(x));
	System.out.println("Sum: " + findSum(x));
	System.out.println("Search for 111: " + search(x,111,x.length));
	System.out.println("Search for 79: " + search(x,79,x.length));
int[][] y = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
	System.out.println("Sum of 2Dim array: " + sumOfArray(y));
	char[][] b = new char[5][19];
	fillArray2(b, '@',0);
	for (char[] r : b) {
		for (char c : r)
			System.out.print(c);
		System.out.println();
	
	}
}
}





	/*
	
	Output
	20! 2432902008176640000
	Sum of firsr 16 Positive integers: 136
	2^12: 4096
	12th Fibonacci number: 144
	Digit Sum of 12345: 15
	RACECAR reversed: RACECAR
	Sum of 5 terms of binary Series: 0.9375
	MaxValue: 133
	Sum: 387
	Search for 111: -1
	Search for 79: 6
	Sum of 2Dim array: 21
	@@@@@@@@@@@@@@@@@
	@@@@@@@@@@@@@@@@@
	@@@@@@@@@@@@@@@@@
	@@@@@@@@@@@@@@@@@
	@@@@@@@@@@@@@@@@@
	 */


	





