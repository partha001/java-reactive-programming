package com.partha.WorkingWithFlux;

import com.github.javafaker.Faker;
import com.partha.WorkingWithFlux.util.Util;

import reactor.core.publisher.Flux;

public class Ex5RangeFunctionInFlux {
	

	public static void main(String[] args) {

		Flux.range(3, 10)
		.subscribe(Util.onNext());
		
		
		Flux<String> names = Flux.range(1, 10)
				.map(item -> Faker.instance().name().fullName());
		names.subscribe(Util.onNext());
		
		
	}


}
