package com.partha.WorkingWithMono;

import java.util.stream.Stream;

import reactor.core.publisher.Mono;

public class Ex1LazyNatureOfMono {
	
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(1);
		//doesnt print the values since no terminal operator
		System.out.println(stream1);
		
		Stream<Integer> stream2 = Stream.of(1);
		//this time prints the values since forEach() is a terminal operation
		stream2.forEach(System.out::println);
		
		
		//similarly with MONO
		Mono<Integer> mono1 = Mono.just(1);
		//print the hashcode and not the value as its not subscribed
		System.out.println(mono1);
		
		//now subscribing to the mono
		//this time it prints the value
		mono1.subscribe(System.out::print);
		
	}


}
