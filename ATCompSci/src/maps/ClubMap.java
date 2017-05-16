package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ClubMap {
	HashMap<String, Set<Student>> club = new HashMap<String, Set<Student>>();
	
	public ClubMap(){
		
	}
	public void join(Student student, String clubName) {
		Set<Student> set = new TreeSet<Student>();
		if(!club.containsKey(clubName)){
			
		set.add(student);
		club.put(clubName, set);
		}
		else{
			set = club.get(clubName);
			club.remove(clubName);
			set.add(student);
			club.put(clubName, set);
		}
		
	}

	public String toString() {
		String s = "";
		for (String cub : club.keySet()){
			s+= cub+": "+club.get(cub)+"\n";
		}
		return s;
		
		
	}

	

}
