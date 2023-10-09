package com.partha.WorkingWithMono;

import com.github.javafaker.Faker;
import com.partha.WorkingWithMono.util.Util;

import reactor.core.publisher.Mono;

public class Ex6EmptyOrError {

public static void main(String[] args) {
		
		//simulating a scenario when there is no data to emit. 
		// change input test
		userRepository(2).subscribe(Util.onNext(),
				Util.onError(),
				Util.onComplete());
		
	}
	
	private static Mono<String> userRepository(int userId){
		if(userId == 1) { //using mono to return data
			return Mono.just(Faker.instance().name().firstName());
		}else if(userId == 2) { // returning no elments in the monno
			return Mono.empty();
		}else { //returning error via mono
			return Mono.error(new RuntimeException("no datafound"));
		}
			
		
	}


}
