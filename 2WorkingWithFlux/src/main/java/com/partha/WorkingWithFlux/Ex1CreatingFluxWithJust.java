package com.partha.WorkingWithFlux;

import com.partha.WorkingWithFlux.util.Util;

import reactor.core.publisher.Flux;

public class Ex1CreatingFluxWithJust {

public static void main(String[] args) {
		
		//creating flux with one object
		Flux<Integer> flux1 = Flux.just(1);
		flux1.subscribe(Util.onNext());
		
		//creating flux with multiple object
		Flux<Integer> flux2 = Flux.just(1,2);
		flux2.subscribe(Util.onNext(), Util.onError() , Util.onComplete());
		
		//creating an empty flux
		Flux<Integer> flux3 = Flux.empty();
		flux3.subscribe(Util.onNext(), Util.onError() , Util.onComplete());
	
		
	}


}
