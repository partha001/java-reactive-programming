package com.partha.WorkingWithFlux.util;

import java.util.function.Consumer;

public class Util {
	
	//defining my own custom consumer for onNext() .
		//note the below method name can be anything
		public static Consumer<Object> onNext(){
			return  item -> System.out.println("Received : "+ item);
		}
		
		//my own custom error-consumer
		public static Consumer<Throwable> onError(){
			return  e -> System.out.println("Received : "+ e.getMessage());
		}
		
		//my own custom onComplete runnable
		public static Runnable onComplete() {
			return () -> System.out.println("Completed");
		}
		



}
