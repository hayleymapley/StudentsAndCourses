package nz.ac.vuw.hayley.StudentsAndCourses;

public class Student {
	
	private static int uniqueId = 1;
	private String firstName;
	private String lastName;
	private int id = uniqueId;
	private boolean internationalStatus;
	private double pricePerPoint;

	public Student(String n, String o, boolean b) {
		firstName = n;
		lastName = o;
		internationalStatus = b;
		pricePerPoint = 72.26;
		if (internationalStatus) {
			pricePerPoint = pricePerPoint*4.13;
		}
		uniqueId++;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String newName) {
		this.firstName = newName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newName) {
		this.lastName = newName;
	}

	public int getId() {
		return id;
	}

	public void setId(int newId) {
		this.id = newId;
	}

	public boolean getStatus() {
		return internationalStatus;
	}

	public void setStatus(boolean b) {
		internationalStatus = b;
	}

	public double getPricePerPoint() {
		return pricePerPoint;
	}

	public void setPricePerPoint(double newPP) {
		pricePerPoint = newPP;
	}

	public String toString() {
		return "Name: " + this.getFirstName() + " " + this.getLastName() + "\n" +
				"ID: " + this.getId() + "\n" +
				"International: " + this.getStatus() + "\n" +
				"Price Per Point: " + this.getPricePerPoint() + "\n";

	}
}
