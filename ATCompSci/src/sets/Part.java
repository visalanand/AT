package sets;

public class Part implements Comparable<Part> {
	private String make, mode, rest;
	private int year;

	public Part(String mak, String model,String ret,int yr) {
		make = mak;
		mode = model; 
		rest = ret;
	year = yr;

	}

	// have to have compareTo if implements Comparable
	public int compareTo(Part rhs) {

		if (make.charAt(0) < rhs.make.charAt(0)) {
			return -1;
		} else if (make.charAt(0) == rhs.make.charAt(0)) {

			if (mode.charAt(0) < rhs.mode.charAt(0)) {
				return -1;
			} else if (mode.charAt(0) == rhs.mode.charAt(0)) {

				if (year < rhs.year) {
					return -1;
				} else if (year == rhs.year) {

					return 0;

				} else if (year > rhs.year) {
					return 1;
				}

			} else if (mode.charAt(0) > rhs.mode.charAt(0)) {
				return 1;
			}

		} else if (make.charAt(0) > rhs.make.charAt(0)) {
			return 1;
		}
		return year;

	}

	public String toString() {
		return "";
	}
}