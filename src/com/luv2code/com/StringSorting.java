package com.luv2code.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringSorting {

	public static void printCubesOfOddNumbers() {

		
	}

	public static void printSquaresOfOddNumbers() {

		Predicate<? super Integer> testPredicate = i -> i%2 !=0;
		
		Arrays.asList(2, 4, 3, 6, 7, 8, 9, 0).stream().filter(testPredicate).
		map(i -> i * i +" "+i).forEach(System.out::println);

		//System.out.println(ee);
	}

	public static void reverseList() {
		Arrays.asList(2, 4, 3, 6, 7, 8, 9, 0).stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

	}
	
	public static void sorting() {
		List<String> sList = Arrays.asList("PCF","AZURE","SPRING"
				,"HIBERNATE","DOCKER","KUBERNETES","AWS","API","MICROSERVICES","SPRING BOOT");
						
	   // sList.stream().sorted().forEach(System.out::println);
		
		//sList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		sList.stream().sorted(Comparator.comparing(s -> s.length())).forEach(System.out::println);
		
	}
	
	public static void addNumbers() {
		
		//int total =Arrays.asList(2, 4, 3, 6, 7, 8, 9, 0).stream().mapToInt(i -> count+i).sum();
		
		//int total =Arrays.asList(2, 4, 3, 6, 7, 8, 9, 0).stream().reduce(0, (x,y) -> x+y);
		int total =Arrays.asList(2, 4, 3, 6, 7, 8, 9, 0).stream().reduce(0, Integer::sum);

		System.out.println(total);
	}

	public static void main(String[] args) {
		sorting();
		
	}

}
