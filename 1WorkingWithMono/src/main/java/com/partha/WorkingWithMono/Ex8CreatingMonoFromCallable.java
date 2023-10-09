package com.partha.WorkingWithMono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

import com.github.javafaker.Faker;

import reactor.core.publisher.Mono;

public class Ex8CreatingMonoFromCallable {

	public static void main(String[] args) {


		Supplier<String> supplier = () -> getName();
		Mono<String> mono = Mono.fromSupplier(supplier);
		mono.subscribe();


		//creating mono from callable 
		//the method signature is same as supplier. 
		//i..e takes no arguments but returns some data
		Callable<String> callable = ()-> getName();
		mono.subscribe(System.out::println);

	}

	private static String getName() {
		System.out.println("generating mono from supplier");
		return Faker.instance().name().firstName();
	}

}
