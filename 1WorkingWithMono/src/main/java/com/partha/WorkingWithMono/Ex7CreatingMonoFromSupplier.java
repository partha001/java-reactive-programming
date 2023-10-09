package com.partha.WorkingWithMono;

import java.util.function.Supplier;

import com.github.javafaker.Faker;

import reactor.core.publisher.Mono;

public class Ex7CreatingMonoFromSupplier {

	public static void main(String[] args) {

		Mono<String> mono = Mono.just(getName());
		//note that the sysout is executed since we have subscribed to the mono
		mono.subscribe();
		
		
		//writing mono from supplier
		mono = Mono.fromSupplier(()->getName());
		mono.subscribe(System.out::println);
		
		//another way of writing this as 
		Supplier<String> supplier = () -> getName();
		mono.fromSupplier(supplier);
		mono.subscribe();

	}
	
	private static String getName() {
		System.out.println("generating mono from supplier");
		return Faker.instance().name().firstName();
	}


}
