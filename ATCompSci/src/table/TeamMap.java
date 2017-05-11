package table;



import java.util.HashMap;

public class TeamMap {
	private HashMap<Wrestler, Integer> team = new HashMap<Wrestler, Integer>();
	
	public Integer add(Wrestler wrestler){
		if(wrestler.getWeight() < 110)
			return team.put(wrestler, 0);
		if(wrestler.getWeight() < 120)
			return team.put(wrestler, 1);
		 if(wrestler.getWeight() < 130)
			return team.put(wrestler, 2);
		if(wrestler.getWeight() < 140)
			return team.put(wrestler, 3);
		if(wrestler.getWeight() < 150)
			return team.put(wrestler, 4);
		if(wrestler.getWeight() < 160)
			return team.put(wrestler, 5);
		if(wrestler.getWeight() < 170)
			return team.put(wrestler, 6);
		if(wrestler.getWeight() < 180)
			return team.put(wrestler, 7);
		if(wrestler.getWeight() < 190)
			return team.put(wrestler, 8);
		
		return team.put(wrestler, 9);
	}
	
	public int get(Wrestler w){
		return team.get(w);
	}
	
	public void changeWeightGroup(Wrestler w, int teamNum){
		team.put(w, teamNum);
	}
	public void remove (Wrestler a){
		team.remove(a);
	}
	
	public String toString(){
		String n = "";
		for (Wrestler w: team.keySet()){
			n+= w.name+" "+team.get(w)+"\n";
		}
		return n;
	}
}