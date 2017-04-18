package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import maps.Wrestler;

public class TeamSet {

	HashSet<Wrestler> team = new HashSet<Wrestler>(); 
	public TeamSet(){
		
	}
	
	
	public void add(Wrestler wrestle){
		team.add(wrestle);
	}
	public double avgWeight(){
		Iterator<Wrestler> iter = team.iterator();
		double weight = 0;
		while(iter.hasNext()){
			weight+= iter.next().getWeight();
		}
		return weight/team.size();
	}
	
	public Set<Wrestler> getLightWeights(){
		Iterator<Wrestler> iter = team.iterator();
		Set<Wrestler> light= new HashSet<Wrestler>();
		Wrestler wr;
		while(iter.hasNext()){
			wr= iter.next();
			if(wr.getWeight()<120)
			light.add(wr);
		}
		return light;
	}
	
	
}
