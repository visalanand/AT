package queues;

public class Swimmer implements Comparable {
	public double height, weight;
	public int age;
	public Swimmer (double _height, double _weight, int _age){
		height = _height;
		weight = _weight;
		age = _age;
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object _swim) {
		// TODO Auto-generated method stub
		Swimmer swim = (Swimmer)_swim; 
		if (height > swim.height)
			return 1;
		
		else if (height < swim.height)
			return -1;
		
		if (weight>swim.weight)
			return 1;
		else if (weight < swim.weight)
			return -1;
		if (age > swim.age)
			return 1;
		else if (age < swim.age)
			return -1;
		
		
		
		
		return 0;
	}
	public boolean equals(Object o){
		Swimmer op = (Swimmer)o;
		return compareTo(op) == 0;
		
		
	}
	public Object clone(){
		return new Swimmer (height , weight ,age);
	}
	public String toString (){
		return "height "+height + " weight "+weight + " age "+age;
	}

}
