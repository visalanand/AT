package sets;

import java.util.ArrayList;

public class Coin {
	public String denom;
	public int year;
	
	
	public Coin( int _year,String _denom){
		denom = _denom;
		year = _year;
		
	}


	public String getDenom() {
		return denom;
	}


	public void setDenom(String denom) {
		this.denom = denom;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	
//	public int isUnique(ArrayList<Coin>ar) {
//		// TODO Auto-generated method stub
//
//		int a = year/10;
//		
//		  int unique = 0;
//		for ( int x = 0; x< ar.size();x++){
//			if (a!= ar.get(x).year/10 && denom != ar.get(x).denom ){
//				
//			}
//			else{
//				unique++;
//			}
//		}
//	}
//	
	
	public int hashCode(){
		return year/10 * denom.hashCode();
	}
	public String toString(){
		return denom+ " "+ year+ " ";
	}
	
	
	
	
	

}
