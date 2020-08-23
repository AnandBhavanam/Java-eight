package com.luv2code.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoopNumbers {
	
	public static void loopThroughList(List<Integer> list) {
		
		
		List<Integer> al = list.stream().sorted((o1,o2) -> o1> o2 ? +1: o1< o2 ? -1: 0).collect(Collectors.toList());
		
		System.out.println(al);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		loopThroughList(Arrays.asList(2,5,6,5,7,8,9));
		
	}

}
