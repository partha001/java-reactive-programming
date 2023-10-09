package com.partha.WorkingWithMono;

import com.github.javafaker.Faker;

import reactor.core.publisher.Mono;

public class Ex9PipelineBuildVsExecution {

	public static void main(String[] args) {

		//this will not execute the Mono. rather it will just build it .
		getName();

		//here the pipeline get executed since we are subscribing to it.
		getName().subscribe(System.out::println);

		//note this below call remains blocked till the above execution is complete
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
