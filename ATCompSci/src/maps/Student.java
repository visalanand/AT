package maps;

public class Student implements Comparable {
	String firstName, lastName;
	int id;

	public Student() {

	}

	public Student(String _fir, String _last, int _id) {
		firstName = _fir;
		lastName = _last;
		id = _id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

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
		if (this.hashCode() == st.hashCode())
			return 0;
		else if (this.hashCode() < st.hashCode()) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
