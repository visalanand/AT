package linkedlists;

public class Term {

	private int coeff, degree;

	public Term(int c, int d) {
		coeff = c;
		degree = d;
	}

	// Add Term to Current term
	public Term add(Term other) {
		return new Term(coeff + other.getCoeff(), degree);
	}
	
	public Term multiply (Term other){
		return new Term (coeff*other.getCoeff(),degree+other.getDegree());
	}
	

	public String toString() {
		return coeff + "x^" + degree;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Term p = new Term(3, 5);
		Term q = new Term(2, 5);
		Term r = new Term(4, 6);
		Term x = p.add(q);
		System.out.println(x);
		System.out.println(q.multiply(r));
	}

	public int getCoeff() {
		return coeff;
	}

	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

}
