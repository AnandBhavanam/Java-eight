package com.luv2code.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {
	
	public static void ps() {
		
		List<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<1000; i++) {
			al.add(i);
		}
		
		List<Integer> reverse = al.parallelStream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		
		for(int i= 0; i< reverse.size()-1; i++) {
			if(reverse.get(i) < reverse.get(i+1)) {
				System.out.println(reverse.get(i));
			}
		}
		
		//System.out.println(reverse);
		
		Long begin =System.currentTimeMillis();
		List<Integer> even = al.stream().filter( i -> 1%2 ==0).collect(Collectors.toList());
		Long end = System.currentTimeMillis();
		System.out.println("total time taken for sequential stream:"+ (end- begin)+ " milliseconds");
			
        Long beginPs =System.currentTimeMillis();
		List<Integer> evenPs = al.parallelStream().filter( i -> 1%2 ==0).collect(Collectors.toList());
		Long endPs = System.currentTimeMillis();
		//Long timeTakenPs = endPs -beginPs;
		System.out.println("total time taken for paralle stream:"+ (endPs- beginPs)+ " milliseconds");
	}
	
	public static void empSort() {
		List<Employee> employees = Arrays.asList(
		         new Employee(1276, "FFF",2000.00),
		         new Employee(7865, "AAA",1200.00),
		         new Employee(4975, "DDD",3000.00),
		         new Employee(4499, "CCC",1500.00),
		         new Employee(9937, "GGG",2800.00),
		         new Employee(5634, "HHH",1100.00),
		         new Employee(9276, "BBB",3200.00),
		         new Employee(6852, "EEE",3400.00));
		
		List<Employee> sort = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		
		System.out.println(sort.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ps();
	}

}
