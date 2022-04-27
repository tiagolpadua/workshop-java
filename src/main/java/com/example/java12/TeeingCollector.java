package com.example.java12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollector {
	public static void main(String[] args) {
		var mean = Stream.of(1, 2, 3, 4, 5).collect(Collectors.teeing(Collectors.summingDouble(i -> i),
				Collectors.counting(), (sum, count) -> sum / count));

		System.out.println("mean: " + mean);

		var employeeList = Arrays.asList(new Employee(1, "A", 100), new Employee(2, "B", 200),
				new Employee(3, "C", 300), new Employee(4, "D", 400));

		var result = employeeList.stream().collect(//
				Collectors.teeing( //
						Collectors.maxBy(Comparator.comparing(Employee::getSalary)), //
						Collectors.minBy(Comparator.comparing(Employee::getSalary)), //
						(e1, e2) -> {
							HashMap<String, Employee> map = new HashMap<String, Employee>();
							map.put("MAX", e1.get());
							map.put("MIN", e2.get());
							return map;
						}) //
		);

		System.out.println(result);
	}
}
