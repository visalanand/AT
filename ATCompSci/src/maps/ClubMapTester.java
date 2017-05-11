package maps;

public class ClubMapTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClubMap IPLE = new ClubMap();
		ClubMap MUN = new ClubMap();
		IPLE.join(new Student("Jangam", 123456));
		IPLE.join(new Student("Srinivasan", 6575));
		IPLE.join(new Student("Liao", 4356));
		IPLE.join(new Student("Mohandas", 6575));
		MUN.join(new Student("Mohandas", 6575));
		MUN.join(new Student("Bhatia", 4345));
		MUN.join(new Student("Murugan", 12675));
		MUN.join(new Student("Rana", 123456));
		MUN.join(new Student("Pandolpho", 2345));
		MUN.join(new Student("Giang", 6575));
		MUN.join(new Student("Srinivasan", 6575));
		System.out.println("IPLE");
		System.out.println(IPLE);
		System.out.println("MUN");
		System.out.println(MUN);
		System.out.println("union: Students belonging to either club");
		System.out.println(IPLE.union2(MUN));
		System.out.println("");
		System.out.println("intersection: Students belonging to both clubs");
		System.out.println(IPLE.intersection2(MUN));
	}

	}


