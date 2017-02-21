package sets;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes {
	public static Set<String> getUniques(String input) {
		Set<String> uniques = new TreeSet<String>();
		String[] letters = input.split("");
		for (String s : letters) {
			uniques.add(s);
		}

		// add code

		return uniques;
	}

	public static Set<String> getDupes(String input) {
		String[] letters = input.split("");
		Set<String> uniques = getUniques(input);
		Set<String> dups = new TreeSet<String>();
		
		boolean[] a = new boolean [letters.length];
		for (int x= 0; x<letters.length;x++) {
			if (uniques.contains(letters[x])) {
				a[x] = (a[x]=true) ? true:false; 
				uniques.remove(letters[x]);
			}
		}
		for (int l = 0;l< a.length;l++){
			if (!a[l]){
				dups.add(letters[l]);
			}
		}

		// add code

		return dups;
	}
}