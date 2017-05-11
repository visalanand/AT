package table;

import java.util.HashSet;

public class TeamSet {
	private HashSet<Wrestler> team = new HashSet<Wrestler>();

	public boolean add(Wrestler w){
		return team.add(w);
	}
	
	public double getAvgWeight(){
		int sum = 0;
		for(Wrestler w : team)
			sum += w.getWeight();
		
		return ((double)sum)/team.size();
	}
	
	public HashSet<Wrestler> getLightweights(){
		HashSet<Wrestler> lgt = new HashSet<Wrestler>();
		
		for(Wrestler w : team)
			if(w.getWeight() < 120)
				lgt.add(w);
		
		return lgt;
	}
	
	public String toString(){
		return team.toString();
	}
}