package sets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CoinTester {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		MyHashSet myHash = new MyHashSet();
		Scanner scan = new Scanner(new File("H:\\coins.txt"));
		ArrayList<Coin> coin = new ArrayList<Coin>();

		while (scan.hasNextLine()) {

			coin.add(new Coin(Integer.parseInt(scan.next()), scan.next()));
			
		}

		
		
		for ( int b = 0; b<coin.size()-1;b++){
			if(coin.get(b).denom.equals(coin.get(b+1))){
				coin.remove(b+1);
			}
			
		}
		for (int x = 0; x < coin.size(); x++) {
			myHash.add(coin.get(x));
			
		}
		
		
		
		for (int a = 0; a < coin.size(); a++) {
			if (myHash.contains(coin.get(a))) {
				System.out.println(coin.get(a));
			}
		}

	}

}
