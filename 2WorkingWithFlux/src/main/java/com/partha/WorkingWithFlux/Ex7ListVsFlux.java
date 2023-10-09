package com.partha.WorkingWithFlux;

import java.util.List;

import com.partha.WorkingWithFlux.util.NameGenerator;

import reactor.core.publisher.Flux;

public class Ex7ListVsFlux {
	
	public static void main(String[] args) {

		System.out.println("printing from list");
		//printing name from list
		List<String> nameFromList = NameGenerator.getNameFromList(5);
		for(String name:nameFromList) {
			System.out.println(name);
		}
		
		System.out.println("now printing from flux");
		
		Flux<String> nameFromFlux = NameGenerator.getNameFromFlux(5);
		nameFromFlux.subscribe(System.out::println);
	}



}
