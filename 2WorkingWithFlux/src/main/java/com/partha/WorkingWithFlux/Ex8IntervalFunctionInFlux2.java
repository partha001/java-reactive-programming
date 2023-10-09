package com.partha.WorkingWithFlux;

import java.time.Duration;

import com.partha.WorkingWithFlux.util.Util;

import reactor.core.publisher.Flux;

public class Ex8IntervalFunctionInFlux2 {
	
	public static void main(String[] args) throws InterruptedException {
		Flux.interval(Duration.ofSeconds(1))
			.subscribe(Util.onNext());
		
		Thread.sleep(5000);
	}



}
