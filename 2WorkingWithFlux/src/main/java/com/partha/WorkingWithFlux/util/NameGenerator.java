package com.partha.WorkingWithFlux.util;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

import reactor.core.publisher.Flux;

public class NameGenerator {
	
	public static Flux<String> getNameFromFlux(int count){
		return Flux.range(0, count)
				.map(item -> generateName());
	}
	
	public static List<String> getNameFromList(int count){
		List<String> names = new ArrayList<>();
		for(int i=0;i<count;i++) {
			names.add(generateName());
		}
		return names;
	}
	
	private static String generateName()  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Faker.instance().name().fullName();
	}


}
