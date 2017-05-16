package maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ClubMapTester {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ClubMap club = new ClubMap();
		Scanner scan = new Scanner(new File("H:\\student.txt"));
		StringTokenizer str = null ;
		Student s;
		while (scan.hasNextLine()){
			str = new StringTokenizer(scan.nextLine());
			s = new Student( str.nextToken("\t")+" "+str.nextToken("\t"),Integer.parseInt(str.nextToken("\t")));
			
			club.join(s,str.nextToken("\t"));
		}
		System.out.println(club);
		System.out.println("Math: "+club.club.get("Math"));
	}

	}


