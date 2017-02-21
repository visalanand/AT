package linkedlists;

import java.util.LinkedList;
import java.util.ListIterator;

public class Fruits {
	public LinkedList<String> bowl;

	public Fruits() {
		bowl = new LinkedList<String>();
		bowl.addLast("Mao");
		bowl.addLast("stalin");
		bowl.addLast("lenin");
		bowl.addLast("Marx");
		bowl.addLast("Hitler");
		bowl.addLast("orange");
		bowl.addLast("papaya");
		bowl.addLast("strawberry");
		bowl.addLast("watermelon");
	}

	public void displayFruit3() {
		ListIterator<String> iter = bowl.listIterator();

		for (String s : bowl) {
			iter.next();
		}
		while (iter.hasPrevious()) {

			System.out.println(iter.previous());

			if (iter.hasPrevious()) {
				iter.previous();
				iter.remove();
			}

		}

	}

	public void insertInList(String newFruit) {
		char a = newFruit.charAt(0);
		ListIterator<String> it = bowl.listIterator();
		boolean done = false;
		while (it.hasNext() && !done) {
			char b = it.next().charAt(0);
			if ((int) a < (int) b) {
				it.previous();
				it.add(newFruit);
				done = true;
			}
		}

	}

	public void removeFruit(char begginingLetter) {
		ListIterator<String> it = bowl.listIterator();
		boolean done = false;
		while (!done && it.hasNext()) {

			if (it.next().charAt(0) == begginingLetter) {
				it.remove();
				done = true;
			}

		}

	}

	public boolean locateWord(String inputWord) {
		ListIterator<String> it = bowl.listIterator();

		while (it.hasNext()) {

			if (it.next().equals(inputWord)) {
				return true;
			}
		}
		return false;
	}

	public LinkedList<String> reverse() {
		ListIterator<String> it = bowl.listIterator();
		LinkedList<String> list = new LinkedList<String>();
		while (it.hasNext()) {
			it.next();
		}
		while (it.hasPrevious()) {
			list.add(it.previous());
		}
		return list;
	}

	public LinkedList<Integer> primes(int n) {
		LinkedList<Integer> intList = new LinkedList<Integer>();

		for (int x = 1; x <= n; x++) {
			Integer a = new Integer(x);
			intList.add(a);
		}

		ListIterator<Integer> it = intList.listIterator();
		int r;
		while (it.hasNext()) {
		r = it.next();
			if (!isPrime(r))
				it.remove();
			
		}
		return intList;
	}
	
	public boolean  isPrime(int x ){
		if ( x == 1)
			return false;
		for ( int a = 2; a< x/2;a++){
			if ( x%a == 0 && (x!=2 && x!=3 ))
				return false;
				
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************Insert*******************");
		Fruits fruits = new Fruits();
		fruits.insertInList("pomegranate");
		System.out.println(fruits.bowl);
		System.out.println();
		System.out.println("*******************Remove**************");
		fruits = new Fruits();
		fruits.removeFruit('p');
		System.out.println(fruits.bowl);
		System.out.println();
		System.out.println("*******************Locate**************");
		fruits = new Fruits();
		System.out.println(fruits.locateWord("bannana"));
		System.out.println();
		System.out.println("*******************Reverse**************");
		fruits = new Fruits();
		System.out.println(fruits.reverse());
		System.out.println();

		System.out.println("*******************Prime**************");
		fruits = new Fruits();
		System.out.println(fruits.primes(50));

	}

}
