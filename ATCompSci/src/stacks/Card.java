package stacks;

public class Card implements Comparable {
	public int suit, value;
	public String [] suits   = {
			"Club", "Diamond","Hearts", "Spades"
	};
	public String [] values = {
			"1","2","3","4","5","6","7", "8", "9","10", "J", "Q", "K", "Ace"
	};
	public Card(int _suit, int _value) {
		suit = _suit;
		value = _value;
	}

	public Card() {
		// TODO Auto-generated constructor stub
		suit = 1;
		value = 2;
	}

	public String toString() {
		if (suit> 4){
			return "Unknown suit";
		}
		if (value > 14){
			return "Unknown value";
		}
		return values[value-1] + " of "+ suits[suit-1];
	}

	public String getSuit() {
		return suits[suit];
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public String getValue() {
		return values[value];
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int compareTo(Card obj) {
		// TODO Auto-generated method stub
		if (value == obj.value)
			return 0;
		return value > obj.value ? 1:-1;
	}
	public static void main (String [] args){
		Card a = new Card();
		Card b = new Card(2,12);
	}

	
}
