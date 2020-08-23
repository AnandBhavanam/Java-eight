package com.luv2code.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void maxMinAvg() {

		List<Integer> al = Arrays.asList(3, 2, 5, 4, 6, 7, 8, 11, 9, 0, -9);

		//max element in a list
		OptionalInt max = al.stream().mapToInt(i -> i).reduce(Integer::max);

		System.out.println(max);

		//min element in a list
		OptionalInt min = al.stream().mapToInt(i -> i).reduce(Integer::min);
		System.out.println(min.getAsInt());

		//sum of elements
		int sum = al.stream().mapToInt(i -> i).sum();

		System.out.println(sum);

		//average of elements
		OptionalDouble avg = al.stream().mapToInt(i -> i).average();

		if (avg.isPresent()) {
			System.out.println(avg.getAsDouble());
		}

	}

	public static void mapAndPredicate() {

		List<Integer> al = Arrays.asList(3, 2, 5, 4, 6, 7, 8, 11, 9, 0, -9);

		
		List<Integer> even = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		List<Integer> squaresOfEvenNumber = al.stream().filter(i -> i % 2 == 0).map(i -> i * i)
				.collect(Collectors.toList());

		// int sumOfSquaresOfEvenNumber = al.stream().filter(i -> i%2 ==0).mapToInt(i ->
		// i*i)
		// .peek(System.out::println)
		// .sum();

		List<Integer> sorted = Arrays.asList(3, 2, 5, 4, 6, 7, 8, 11, 9, 0, -9);

		List<Integer> sortedList = sorted.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		List<String> stringList = Arrays.asList("apple", "mango","cherry","pineapple","watermelon");
		
		//stringList.stream().sorted(Comparator.comparing(s -> s.length())).forEach(System.out::println);
		
		
		stringList.stream().filter(i -> i.length()>5).sorted(Comparator.comparing(s -> s.length())).forEach(System.out::println);

		// System.out.println(sortedList2);

		// System.out.println(squaresOfEvenNumber);
		// System.out.println(sumOfSquaresOfEvenNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mapAndPredicate();
	}

}
