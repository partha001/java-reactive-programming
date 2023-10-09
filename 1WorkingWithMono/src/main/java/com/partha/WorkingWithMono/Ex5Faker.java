package com.partha.WorkingWithMono;

import com.github.javafaker.Faker;

public class Ex5Faker {
	
	public static void main(String[] args) {
		 
		for(int i=0;i<10;i++) {
			System.out.println(Faker.instance().name().fullName());
		}
	}

}
