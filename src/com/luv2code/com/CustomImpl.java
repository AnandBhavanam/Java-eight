package com.luv2code.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomImpl {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));
		
		
		boolean val = courses.stream().allMatch(c -> c.getReviewScore() > 90);
		//System.out.println(val);
		
		Comparator<Course> noOfStudentsDesc = Comparator.comparing(Course::getNoOfStudents).reversed();
	
		List<Course> noOfStudents = courses.stream().sorted(noOfStudentsDesc).collect(Collectors.toList());
		
		Comparator<Course> filter = Comparator.comparing(Course::getNoOfStudents).
				thenComparing(Course::getReviewScore).reversed();
		
		List<Course> both = courses.stream().sorted(filter).skip(3).limit(2).collect(Collectors.toList());
		
		System.out.println(both);
	}
	
	
	//courses.
	

}
