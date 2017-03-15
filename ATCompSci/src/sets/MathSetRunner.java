package sets;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner {
	public static void main(String args[]) throws IOException {
		// add test cases
		Scanner in = new Scanner(new File("H:\\mathsetdata.dat"));
		String n = "";
		while (in.hasNextLine()) {
			n = in.nextLine();
			while (in.hasNextLine()) {
				MathSet ms = new MathSet(n, in.nextLine());
				System.out.println(ms);
				System.out.println("union - " + ms.union());
				System.out.println("intersection - " + ms.intersection());
				System.out.println("difference A-B - " + ms.differenceAMinusB());
				System.out.println("difference B-A - " + ms.differenceBMinusA());
				System.out.println("symmetric difference - " + ms.symmetricDifference() + "\n\n");
			}
		}

		in.close();
	}

}
