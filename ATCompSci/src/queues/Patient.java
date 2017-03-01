package queues;

public class Patient implements Comparable {
	public String name;
	public int priority;
	public int placeInQueue; 
	public Patient(String _name, int _priority, int pl)
	{
		placeInQueue = pl;
		name = _name;
		priority = _priority;
		
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPriority() {
		return priority;
	}



	public void setPriority(int priority) {
		this.priority = priority;
	}



	@Override
	public int compareTo(Object _pat) {
		// TODO Auto-generated method stub
		Patient pat = (Patient)_pat;
		if (priority > pat.priority){
			return 1;
		}
		else if (priority == pat.priority && pat.placeInQueue> placeInQueue )
			return -1;
		else if (priority == pat.priority && pat.placeInQueue< placeInQueue ){
			return 1;
		}
		
		return -1;
		
		
		
	}
	public String toString(){
		return "" + name ;
	}
	
}
