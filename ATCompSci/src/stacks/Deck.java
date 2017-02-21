package stacks;

import java.util.Iterator;
import java.util.Stack;

public class Deck {
	Stack<Card> deck;

	public Deck() {
		deck = new Stack<Card>();
		loadDeck();
	}

	public Stack<Card> getDeck() {
		return deck;
	}

	// Load the stack with 52 cards in order
	public void loadDeck() {
		for (int y = 1; y < 5; y++) {
			for  (int x = 2; x < 15; x++){
				
				deck.push(new Card(y, x));
			}
		}
	}

	// Print the stack - for uniformity,
	// make 13 rows in four columns, filling
	// in each row from left to right
	public String toString() {
		String n = "";
		Iterator iter = deck.iterator();
		for (int x = 0; x < 13; x++) {

			for (int y = 0; y < 4; y++) {
				n += iter.next() + "\t";

			}
			n += "\n";

		}
		return n;
	}

	// Return and remove the top card
	public Card deal() {
		return deck.pop();
	}

	// Take the top half of the deck (26 cards) and alternate card by card with
	// the bottom half
	public void bridgeShuffle() {
		Stack<Card> temp = new Stack<Card>();
		int size = deck.size();
		for (int x = 0; x < size / 2; x++) {
			temp.push(deck.pop());
		}
		Stack<Card> newTemp = new Stack<Card>();
		reverse();
		temp = reverse(temp);
		Iterator iter = deck.listIterator();
		Iterator iter2 = temp.listIterator();
		
		for (int y = 0; y < size; y++) {
			if (iter2.hasNext())
				newTemp.push(temp.pop());
			if (iter.hasNext())
				newTemp.push(deck.pop());
		}

		deck = newTemp;
	}

	// Split the deck at a random spot. Put the stack of cards above the random
	// spot below the other cards
	public void cut() {
		int rand = (int) (Math.random() * 52 + 1);
		Stack<Card> newTemp = new Stack<Card>();

		for (int x = 0; x < rand; x++) {
			newTemp.push(deck.pop());
		}
		Iterator<Card> iter = deck.iterator();
		newTemp = reverse(newTemp);
		
		while (deck.size() != 52) {
			deck.push(newTemp.pop());
			
		}
		
	

	}

	// Complete a bridge shuffle and then cut the deck. Repeat 7 times
	public void completeShuffle() {

		for (int x = 0; x < 7; x++) {
			bridgeShuffle();
			cut();
		}

	}

	// Reverse the order of the cards in the deck
	private void reverse() {
		Stack<Card> rev = new Stack<Card>();

		while (!deck.isEmpty())
			rev.push(deck.pop());

		deck = rev;
	}

	
	
	// Given a Stack of cards as an explicit parameter,
	// reverse the order of the cards in the deck
	private Stack<Card> reverse(Stack<Card> x) {
		Stack<Card> rev = new Stack<Card>();

		while (!x.isEmpty())
			rev.push(x.pop());

		return rev;
	}

	// Combine two decks, one as the implicit
	// parameter, the other as the explicit parameter
	public void combineDecks(Stack<Card> other) {
		other = StackTest.reverseStack(other);
		while (!other.isEmpty()) {
			deck.push(other.pop());
		}

	}

	public static void main(String[] args) {
		// example method calls - you should make your own
		Deck a = new Deck();

		System.out.println("Display after DECK CONSTRUCTION \n" + a + "\n\n");

		a.cut(); 

		System.out.println("Display after CUT \n" + a + "\n\n"); 

		a.bridgeShuffle(); 

		System.out.println("Display after BRIDGE SHUFFLE \n" + a + "\n\n");
}
}
