package com.partha.WorkingWithFlux;

import com.partha.WorkingWithFlux.util.Util;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Ex9FluxFromMono {
	
	public static void main(String[] args) {
		Mono<String> mono = Mono.just("a");
		
		Flux<String> flux = Flux.from(mono);
		flux.subscribe(Util.onNext());
		
	}


}
