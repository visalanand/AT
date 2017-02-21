package readfile;

import java.util.Random;
import java.util.Scanner;

public class RationalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Numerator followed by denominator");
		int n = Integer.parseInt(keyboard.nextLine());
		int a = Integer.parseInt(keyboard.nextLine());
		
		Rational r1, r2;
		r1 = new Rational (n, a);
		Random rand = new Random ();
		//r2 = new Rational (rand.nextInt(20),rand.nextInt(20) );
		//r2 = new Rational (3,7);
		r2 = new Rational (3,0);
		Rational rSum, rDiff, rProd, rQuot, rRecip;
		System.out.println ("First rational number: " + r1);
		System.out.println ("Second rational number: " + r2);

		if (r1.equals(r2))
		    System.out.println ("r1 and r2 are equal.");
		else
		    System.out.println ("r1 and r2 are NOT equal.");

		if (r1.compareTo(r2) < 0)
		    System.out.println ("r1 is less than r2.");
		else if (r1.compareTo(r2) > 0)
		    System.out.println ("r1 is greater than r2.");
		else
		    System.out.println ("r1 and r2 are equal.");

		rRecip = r1.reciprocal();
		System.out.println ("The reciprocal of r1 is: " + rRecip.getNumerator()+"/"+rRecip.getDenominator());

		rSum = r1.add(r2);
		rDiff = r1.subtract(r2);
		rProd = r1.multiply(r2);
		rQuot = r1.divide(r2);

		System.out.println ("r1 + r2: " + rSum);
		System.out.println ("r1 - r2: " + rDiff);
		System.out.println ("r1 * r2: " + rProd);
		System.out.println ("r1 / r2: " + rQuot);

		System.out.println("2/5  / 3/7 ="+ new Rational (2,5).divide(new Rational ( 3,7)));

	
	
	
	}
	
	
	
	

}
