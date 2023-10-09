package com.partha.WorkingWithMono;

import com.partha.WorkingWithMono.util.Util;

import reactor.core.publisher.Mono;

public class Ex14MonoFromRunnable {

public static void main(String[] args) {
		
		Mono.fromRunnable(timeConsumingProcess())
			.subscribe(Util.onNext(),
					Util.onError(),
					()->{
						System.out.println("process is done");
					});
	}
	
	private static Runnable timeConsumingProcess() {
		return ()-> {
			try {
				Thread.sleep(1000);
				System.out.println("operation completed");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
	}

}
