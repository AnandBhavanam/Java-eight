package com.luv2code.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoopNumbers {

	public static void loopThroughList(List<Integer> list) {

		// list

		int total = 0;
		List<Integer> al = list.stream().sorted((o1, o2) -> o1 > o2 ? +1 : o1 < o2 ? -1 : 0)
				.collect(Collectors.toList());

		// System.out.println(al);
		Long count = (long) al.stream().filter(x -> x % 2 == 0).mapToInt(i -> total + 1).sum();

		// al.stream().filter(x -> x%2 ==0).forEach(System.out.print(total++));

		System.out.println(count);
	}

	public static void loopThroughListOfStrings(List<String> input) {

	//	input.stream().forEach(System.out::println);
		
		//List<String> output = input.stream().filter(i -> i.contains("apple")).collect(Collectors.toList());
		
		List<String> output = input.stream().filter(i -> i.length()>=4).collect(Collectors.toList());
		
		System.out.println(output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//loopThroughList(Arrays.asList(2, 5, 6, 5, 7, 8, 9));
		loopThroughListOfStrings(Arrays.asList("appl","apple", "mango-apple","grapes","watermelon","pine-apple","banana"));
		

	}

}
