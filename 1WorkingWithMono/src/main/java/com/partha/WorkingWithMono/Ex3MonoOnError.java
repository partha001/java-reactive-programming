package com.partha.WorkingWithMono;

import reactor.core.publisher.Mono;

public class Ex3MonoOnError {

	public static void main(String[] args) {

		//exploring overloads of mono 
		Mono<Integer> mono1 = Mono.just("")
				.map(item -> item.length())
				.map(item -> item/0);
				
		
		//lets observe behavior1 when no onError is mentioned
//		mono1.subscribe();

		
		//behavior2 : when we explicity mention a consumer for the error i.e. an error handler consumer
		mono1.subscribe(
				item -> System.out.println(item), 
				error-> System.out.println(error.getMessage()), 
				()-> System.out.println("completed"));
		
		
		
	}


}
