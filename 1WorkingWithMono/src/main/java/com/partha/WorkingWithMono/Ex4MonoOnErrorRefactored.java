package com.partha.WorkingWithMono;

import com.partha.WorkingWithMono.util.Util;

import reactor.core.publisher.Mono;

public class Ex4MonoOnErrorRefactored {

	public static void main(String[] args) {

		//exploring overloads of mono 
		Mono<Integer> mono1 = Mono.just("partha")
				.map(item -> item.length())
				.map(item -> item/0);
				
		
		//lets observe behavior1 when no onError is mentioned
		//mono1.subscribe();

		
		//behavior2 : when we explicity mention a consumer for the error i.e. an error handler consumer
		mono1.subscribe(
				item -> System.out.println(item), 
				error-> error.printStackTrace(), 
				()-> System.out.println("completed"));
		
		
		 //the same thing can be written by writing reuable util and then resuing
		 //as shown below
		mono1.subscribe(
				Util.onNext(),
				Util.onError(),
				Util.onComplete());
		
	}


}
