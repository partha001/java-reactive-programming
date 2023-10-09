package com.partha.WorkingWithMono;

import reactor.core.publisher.Mono;

public class Ex2MonoSubscribe {

public static void main(String[] args) {
		
		//exploring overloads of mono 
		Mono<Integer> mono1 = Mono.just(1);
		
		//here also we subscribe n the mono emits the data
		//however since we are not doing any operation like printing hence we dont get any output
		mono1.subscribe();
		
		//overload2 : passing a consumer to the subscribe method
		mono1.subscribe(i -> System.out.println(i));
		
		//overload3
		mono1.subscribe(
				item -> System.out.println(item), 
				error-> System.out.println(error.getMessage()), 
				()-> System.out.println("completed"));
		
		
	}


}
