package maps;

public class Student implements Comparable {
	String firstName, lastName;
	int id;

	public Student() {

	}

	public Student(String _fir, int _id) {
		firstName = _fir;
		
		id = _id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int hashcode() {
		return firstName.hashCode() + lastName.hashCode();
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Student st = (Student) arg0;
		int x= (int)this.firstName.charAt(0);
		int a= (int)st.firstName.charAt(0);
		if(x<a){
			return -1;
		}
		else if (x>a){
			return 1;
		}
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	public String toString(){
		return firstName + " "+id;
	}
}
