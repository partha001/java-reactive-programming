package com.partha.WorkingWithFlux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.partha.WorkingWithFlux.util.Util;

import reactor.core.publisher.Flux;

public class Ex4CreatingFluxFromStream3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		Stream<Integer> stream = list.stream();
//		stream.forEach(System.out::println);
//		stream.forEach(System.out::println);
		
		Flux<Integer> integerFlux = Flux.fromStream(() -> stream);
		
		integerFlux.subscribe(
				Util.onNext(),
				Util.onError(),
				Util.onComplete());
		
		integerFlux.subscribe(
				Util.onNext(),
				Util.onError(),
				Util.onComplete());
		
	}




}
