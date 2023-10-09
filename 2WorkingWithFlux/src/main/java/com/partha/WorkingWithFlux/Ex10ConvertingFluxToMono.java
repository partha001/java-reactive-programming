package com.partha.WorkingWithFlux;

import com.partha.WorkingWithFlux.util.Util;

import reactor.core.publisher.Flux;

public class Ex10ConvertingFluxToMono {
	
	public static void main(String[] args) {
		Flux.range(0, 10)
			.next()
			.subscribe(Util.onNext(),Util.onError(),Util.onComplete());
		
		
//		// the first item which goes via next  in this case is 4. thus it sends 4 to its subscriber
//		Flux.range(0, 10)
//		.filter(item -> item>3)
//		.next()
//		.subscribe(Util.onNext(),Util.onError(),Util.onComplete());
		
		
//		//in this case the first item is 0 is passed by next to the filter . the filter removes this record 
//		//thus an empty mono is returned to the subscriber
//		Flux.range(0, 10)
//		.next()
//		.filter(item -> item>3)
//		.subscribe(Util.onNext(),Util.onError(),Util.onComplete());
		
		
		
		
	}


}
