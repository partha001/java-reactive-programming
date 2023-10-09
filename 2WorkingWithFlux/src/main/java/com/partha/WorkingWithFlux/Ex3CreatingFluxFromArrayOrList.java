package com.partha.WorkingWithFlux;

import java.util.Arrays;
import java.util.List;

import com.partha.WorkingWithFlux.util.Util;

import reactor.core.publisher.Flux;

public class Ex3CreatingFluxFromArrayOrList {

	public static void main(String[] args) {

		//creating flux from list
		List<String> strings = Arrays.asList("a","b","c");
		Flux.fromIterable(strings)
		.subscribe(Util.onNext());


		//creating from array
		Integer[] arr = {1,2,3,4};
		Flux.fromArray(arr)
		.subscribe(Util.onNext());

	}

}
