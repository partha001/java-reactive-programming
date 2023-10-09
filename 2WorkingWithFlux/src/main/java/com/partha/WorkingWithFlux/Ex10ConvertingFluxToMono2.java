package com.partha.WorkingWithFlux;

import com.partha.WorkingWithFlux.util.Util;

import reactor.core.publisher.Flux;

public class Ex10ConvertingFluxToMono2 {
	
	public static void main(String[] args) {
		Flux.range(0, 10)
			.next()
			.subscribe(Util.onNext(),Util.onError(),Util.onComplete());
		
	}


}
