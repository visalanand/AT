package sets;

public class Coin implements Comparable{
	public String denom;
	public int year;
	
	
	public Coin(String _denom, int _year){
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


	@Override
	public int compareTo(Object _coin) {
		// TODO Auto-generated method stub
		Coin coin = (Coin)_coin;
		int a = year/10;
		int b = coin.getYear()/10;
		  
		
		
		if (coin.getDenom()!= denom && a!= b  ){
			return 1;
		}
		if (coin.getDenom() == denom && a==b)
		return 0;
		
		
		return -1;
	}
	
	
	
	
	

}
