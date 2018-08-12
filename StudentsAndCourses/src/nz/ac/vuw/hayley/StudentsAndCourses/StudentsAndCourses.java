package nz.ac.vuw.hayley.StudentsAndCourses;

import java.util.*;

public class StudentsAndCourses {

	
	
	public static void main(String[] args) {

		ArrayList<Course> courses = new ArrayList<Course>();
		Course swen501 = new Course("Professional Programming Skills", "SWEN 501", 15, 200);
		Course swen502 = new Course("Software Development Studio I", "SWEN 502", 45, 200);
		Course swen503 = new Course("Software Development Studio II", "SWEN 503", 45, 200);
		Course swen505 = new Course("Professional Seminar", "SWEN 505", 15, 200);
		courses.add(swen501);
		courses.add(swen502);
		courses.add(swen503);
		courses.add(swen505);
		
		//LECTURERS
		Lecturer l = new Lecturer("Craig", "Anslow", 9600);
		for (Course c : courses) {
			c.employ(l);
		}
		Lecturer m = new Lecturer("Michael", "Homer", 9600);
		for (int i=0; i<courses.size()-1; i++) {
			Course course = courses.get(i);
			course.employ(m);
		}
		Lecturer n = new Lecturer("Dionysios", "Athanasopoulos", 9600);
		for (int i=1; i<courses.size()-1; i++) {
			Course course = courses.get(i);
			course.employ(n);
		}
		Lecturer o = new Lecturer("Karsten", "Lundqvist", 9600);
		swen503.employ(o);

		//STUDENTS
		ArrayList<Student> allStudents = new ArrayList<Student>();
		Student s = new Student("Hayley", "Mapley", false);
		Student t = new Student("Oliver", "Pelham", false);
		Student u = new Student("Fabio", "Hernandez", true);
		Student v = new Student("Stephanie", "Carter", false);
		allStudents.add(s);
		allStudents.add(t);
		allStudents.add(u);
		allStudents.add(v);

		//need to condense - set profit
		double totalPaid501 = ((s.getPricePerPoint()+t.getPricePerPoint()+u.getPricePerPoint()+v.getPricePerPoint())*(swen501.getPoints()));
		double totalPaid502 = ((s.getPricePerPoint()+t.getPricePerPoint()+u.getPricePerPoint()+v.getPricePerPoint())*(swen502.getPoints()));
		double totalPaid503 = ((s.getPricePerPoint()+t.getPricePerPoint()+u.getPricePerPoint()+v.getPricePerPoint())*(swen503.getPoints()));
		double totalPaid505 = ((s.getPricePerPoint()+t.getPricePerPoint()+u.getPricePerPoint()+v.getPricePerPoint())*(swen505.getPoints()));
		
		swen501.setProfit(totalPaid501 - l.getCost()-swen501.getRoomCost());
		swen502.setProfit(totalPaid502 - l.getCost()-swen502.getRoomCost());
		swen503.setProfit(totalPaid503 - l.getCost()-swen503.getRoomCost());
		swen505.setProfit(totalPaid505 - l.getCost()-swen505.getRoomCost());
		
		//display all info
		for (Course c : courses) {
			c.displayCourseInfo();
			c.displayCourseList();
		}
		System.out.println(allStudents);
	}
}
