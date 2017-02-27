package sets;

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


	
	public int isUnique() {
		// TODO Auto-generated method stub
		Coin coin = this;
		int a = year/10;
		int b = coin.getYear()/10;
		  
		
		
		if (!coin.getDenom().equals(denom) && a!= b  ){
			return 1;
		}
		if (coin.getDenom().equals(denom) && a==b)
		return 0;
		
		
		return -1;
	}
	
	
	public int hashCode(){
		return year * denom.hashCode();
	}
	
	
	
	
	

}
