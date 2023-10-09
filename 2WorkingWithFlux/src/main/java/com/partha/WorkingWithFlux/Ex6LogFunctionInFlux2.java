package com.partha.WorkingWithFlux;

import com.github.javafaker.Faker;
import com.partha.WorkingWithFlux.util.Util;

import reactor.core.publisher.Flux;

public class Ex6LogFunctionInFlux2 {
	
	public static void main(String[] args) {
		
		 Flux.range(1, 10)
					.log()
					.map(item -> Faker.instance().name().fullName())
					.log()
					.subscribe(Util.onNext());
			
			
		}


}
