package com.partha.WorkingWithMono;

import java.util.concurrent.CompletableFuture;

import com.github.javafaker.Faker;
import com.partha.WorkingWithMono.util.Util;

import reactor.core.publisher.Mono;

public class Ex13CreatingMonoFromCompletableFuture {

public static void main(String[] args) throws InterruptedException {
		
		Mono.fromFuture(getName())
				.subscribe(Util.onNext());
		

	}
	
	private static CompletableFuture<String> getName(){
		return CompletableFuture.supplyAsync(()->  Faker.instance().name().fullName());
	}


}
