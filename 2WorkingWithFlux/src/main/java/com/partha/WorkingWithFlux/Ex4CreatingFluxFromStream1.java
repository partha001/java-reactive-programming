package com.partha.WorkingWithFlux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex4CreatingFluxFromStream1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		Stream<Integer> stream = list.stream();
		
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
	}


}
