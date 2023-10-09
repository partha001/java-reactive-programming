package com.partha.WorkingWithFlux;

import reactor.core.publisher.Flux;

public class Ex2CreatingFluxFromAnotherFlux {

	public static void main(String args[]) {

		Flux<Integer> integerFlux = Flux.just(1,2,3,4);

		//subscriber1
		integerFlux.subscribe(item -> System.out.println("subscriber1 " + item));

		//subscriber2
		//say this subscriber wants to read only even values
		//creating flux from flux
		Flux<Integer> evenFlux = integerFlux.filter( item -> item %2 ==0 );
		evenFlux.subscribe(item -> System.out.println("subscriber2 "+ item));		


	}


}
