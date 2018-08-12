package nz.ac.vuw.hayley.StudentsAndCourses;

public class Lecturer {
	
	private String firstName;
	private String lastName;
	private double cost; //per tri
	
	public Lecturer(String n, String n2, double c) {
		firstName = n;
		lastName = n2;
		cost = c;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newName) {
		firstName = newName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String newName) {
		lastName = newName;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double newCost) {
		cost = newCost;
	}

	public String toString() {
		return "\tName: " + this.getFirstName() + " " + this.getLastName() + "\n" +
				"\tCost: " + this.getCost();
	}
}
