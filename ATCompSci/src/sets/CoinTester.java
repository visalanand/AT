package sets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CoinTester {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		MyHashSet myHash = new MyHashSet();
		Scanner scan = new Scanner (new File("H:\\coins.txt"));
		ArrayList<Coin> coin = new ArrayList<Coin>();
		
		while (scan.hasNextLine()){
			
			coin.add(new Coin(Integer.parseInt(scan.next()),scan.next()));
		}
	
		
		for ( int x =0; x< coin.size();x++){
		System.out.println(	myHash.add(coin.get(x)));
		}
		
		
		for (int a = 0; a< coin.size();a++){
			if (myHash.contains(coin.get(a))){
				System.out.print(coin.get(a));
			}
		}
		
		
		
	}

}
