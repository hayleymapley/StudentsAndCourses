package nz.ac.vuw.hayley.StudentsAndCourses;

import java.util.*;

public class Course {
	private String name;
	private String id;
	private int points;
	private double roomCost; //per tri
	private ArrayList<Lecturer> lecturers;
	private ArrayList<Student> students;
	private double profit;
	
	public Course(String n, String i, int p, double c) {
		name = n;
		id = i;
		points = p;
		roomCost = c;
		students = new ArrayList<Student>();
		lecturers = new ArrayList<Lecturer>();
		profit = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String newId) {
		this.id = newId;
	}
	
	public ArrayList<Student> getListStudents() {
		return students;
	}
	
	public void setStudents(ArrayList<Student> newList) {
		this.students = newList;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int newPoints) {
		points = newPoints;
	}
	
	public double getRoomCost() {
		return roomCost;
	}
	
	public void setRoomCost(double newCost) {
		roomCost = newCost;
	}
	
	public double getProfit() {
		return profit;
	}
	
	public void setProfit(double newProfit) {
		profit = newProfit;
	}
	
	public void enrol(Student n) {
		students.add(n);
	}
	
	public void employ(Lecturer l) {
		lecturers.add(l);
	}
	
	public void displayCourseList() {
		System.out.println("");
		System.out.println("Course list: ");
		System.out.println("");
		for (Student s : students) {
			System.out.println(s.toString());
		}
		System.out.println("Total number of students: " + students.size());
	}
	
	public void displayCourseInfo() {
		System.out.println("");
		System.out.println("Course name: " + this.getName());
		System.out.println("Course ID: " + this.getId());
		System.out.println("Points value: " + this.getPoints());
		System.out.println("Room Cost: " + this.getRoomCost());
		System.out.println("Profit: " + this.getProfit());
		if (this.getProfit()<0) {
			System.out.println("(Not enough students to turn a profit.)");
		}
		System.out.println("Lecturers: ");
		for (Lecturer l : lecturers) {
			System.out.println(l.toString());
		}
		System.out.println("Total number of lecturers: " + lecturers.size());
		System.out.println("");
	}
	
}
