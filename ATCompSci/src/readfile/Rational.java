package readfile;

public class Rational {
 int num,den;
 boolean isGreater;
	public Rational (int _num, int den2){
		num = _num;
		if ( den2 == 0 )
			
		den = 1;
		else {
			den = den2;
		}
		
	}
	
	
	
	public int getNumerator() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public int getDenominator() {
		return den;
	}
	
	public Rational reduce (int num1, int den1){
		if ( num1 > den1){
			
			for ( int x =1; x< num1;x++){
				if (num1%x == 0 && den1%x == 0){
					num1 /=x;
					den1 /=x;
				}
			}
			return new Rational ( num1 , den1);
			
		}
		else{

			for ( int x =1; x< den1;x++){
				if (num1%x == 0 && den1%x == 0){
					num1 /=x;
					den1 /=x;
				}
			
		}
			return new Rational ( num1 , den1);
		}
		
		
	}



	public void setDen(int den) {
		this.den = den;
	}
	
	public Rational reciprocal(){
		return new Rational(den,num);
	}
	
	public int lcm(int den2){
		
		
		if (den2< den){
		for(int i = 1; i <= den2; i++) {
		    if(i*den % den2 == 0)
		        return Math.abs(i*den);
		}
	    return Integer.MIN_VALUE;

		}
		else{
			for(int i = 1; i <= den; i++) {
			    if(i*den2 % den == 0)
			        return Math.abs(i*den2);
			
			}
		    return Integer.MIN_VALUE;

			
		}
		
		}
		
		
	
	
	public Rational add(Rational ra){
		
		if ( lcm(ra.getDenominator())> Integer.MIN_VALUE){
			int n = num*(lcm(ra.getDenominator())/den);
			int n2 = ra.getNumerator()* (lcm(ra.getDenominator())/ra.getDenominator());
			
			
			
			return reduce (n + n2 , lcm(ra.getDenominator()));
		}
		return null;
		
//			int n = ra.getNumerator()*(lcm(ra.getDenominator())/den);
//			int n2 = num* (lcm(ra.getDenominator())/den);
//			return new Rational (num*(den/lcm(ra.getDenominator())+ra.getNumerator()*(den/lcm(ra.getDenominator()))),lcm(ra.getDenominator()));
//		
		

	}
	public Rational subtract (Rational ra){
		
		int n = num*(lcm(ra.getDenominator())/den);
		int n2 = ra.getNumerator()* (lcm(ra.getDenominator())/ra.getDenominator());
		return reduce (n - n2 , lcm(ra.getDenominator()));
	
	}
	
	
	public Rational multiply (Rational ra){
		int n = num*(lcm(ra.getDenominator())/den);
		int n2 = ra.getNumerator()* (lcm(ra.getDenominator())/ra.getDenominator());
		return reduce (num * ra.getNumerator() , den*ra.getDenominator());
	}
	
	
	public Rational divide ( Rational ra){
		int n = num*(lcm(ra.getDenominator())/den);
		int n2 = ra.getNumerator()* (lcm(ra.getDenominator())/ra.getDenominator());
		return reduce (num* ra.getDenominator() , den*ra.getNumerator() );
	}
	
	
	public boolean equals (Rational ra){
		
		return ( num == ra.getNumerator()) && (den == ra.getDenominator());
	}
	
	
	public int compareTo(Rational ra){
		
		if ((num/den) > (ra.getNumerator()/ra.getDenominator()))
			return 1;
		else if (num/den < ra.getNumerator()/ra.getDenominator())
			return -1;
		else 
			return 0;
		
	}
	public boolean checkUndefined(){
		return den == 0;
	}
	
	
	
	public String toString (){
		return "Numerator: "+num+ " Denominator:"+den;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
