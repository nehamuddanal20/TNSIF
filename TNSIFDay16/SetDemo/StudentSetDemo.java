package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		
		

		Set<Student> std = new HashSet<Student>();
		
		std.add(new Student(101, "Neha", 90));
		std.add(new Student(102, "Gita", 78));
		std.add(new Student(103, "Harshu", 89));
		std.add(new Student(104, "Pratik", 96));
		
		System.out.println(std);
		
	}

}