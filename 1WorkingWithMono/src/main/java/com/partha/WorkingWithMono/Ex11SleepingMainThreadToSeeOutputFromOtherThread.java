package com.partha.WorkingWithMono;

import com.github.javafaker.Faker;
import com.partha.WorkingWithMono.util.Util;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class Ex11SleepingMainThreadToSeeOutputFromOtherThread {

public static void main(String[] args) {
		
		//this will not execute the Mono. rather it will just build it .
		getName();
		
		//he subscribe on will make this call non-blocking
		getName()
			.subscribeOn(Schedulers.boundedElastic())
			.subscribe(Util.onNext());
		
		//note this below call completes before the previous processing is over
		getName();

		//here we add the delay to keep the main thread alive while the other thread completes its processing
		//add we can see the output
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
