package com.partha.WorkingWithMono;

import com.github.javafaker.Faker;
import com.partha.WorkingWithMono.util.Util;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class Ex10AsyncNature {

	public static void main(String[] args) {

		//this will not execute the Mono. rather it will just build it .
		getName();

		//he subscribe on will make this call non-blocking
		getName()
		.subscribeOn(Schedulers.boundedElastic())
		.subscribe(Util.onNext());

		//note this below call completes before the previous processing is over
		getName();


	}

	private static Mono<String> getName() {
		System.out.println("entered gatName");

		return Mono.fromSupplier( ()-> {
			System.out.println("generating name ...");
			try {
				Thread.sleep(3000);// simulating some heavy computation
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return Faker.instance().name().fullName();
		}).map( item -> item.toUpperCase());
	}

}
