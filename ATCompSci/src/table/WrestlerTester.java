package table;

public class WrestlerTester {

	public static void main(String args[]){
		
		TeamMap tm = new TeamMap();
		tm.add(new Wrestler("Jake",100));
		tm.add(new Wrestler("Stan",120));
		tm.add(new Wrestler("Fred",129));
		tm.add(new Wrestler("Bob",129));
		Wrestler w = new Wrestler("Juan",180);
		tm.add(w);
		tm.add(new Wrestler("Arnold",199));
		System.out.println(tm.toString());
		tm.changeWeightGroup(w, 10);
		
		System.out.println("Juan is in Group 8");
		
		System.out.println(tm.toString());

	}
}
