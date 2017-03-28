package sets;

public class Part implements Comparable<Part> {
	private String make, mode, rest;
	private int year;

	public Part(String mak, String model, String ret, int yr) {
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
				} 
				else if (year == rhs.year){ 
					
				
					 if (!rest.equals(rhs.rest)){
						return 1;
					}
					return 0;
				}
				
				
			
				
				else if (year > rhs.year) {
					return 1;
				}
			
			
			
			} else if (mode.charAt(0) > rhs.mode.charAt(0)) {
				return 1;
			}

		 else if (make.charAt(0) > rhs.make.charAt(0)) {
			return 1;
		}
		}
	
		return year;

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getRest() {
		return rest;
	}

	public void setRest(String rest) {
		this.rest = rest;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return make + " " + mode + " " + rest;
	}
}