package maps;

import java.util.HashMap;

public class ClubMap {
	HashMap<Student, String> club = new HashMap<Student, String>();

	public void join(Student student) {
		club.put(student, student.firstName);
	}

	public String toString() {

		String s = "";
		for (Student a : club.keySet()) {
			s += a + "\n";
		}
		return s;
	}

	public ClubMap union2(ClubMap a) {
		boolean bool = false;
		ClubMap cl = new ClubMap();
		for (Student s : club.keySet()) {
			for (Student s2 : a.club.keySet()) {
				if (s2.equals(s)) {
					bool = true;
					break;
				}

			}
			if (!bool) {
				cl.join(s);
			}
			bool = false;
		}
		return cl;
	}

}
