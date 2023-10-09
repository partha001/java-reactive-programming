package com.partha.WorkingWithFlux;

import java.util.concurrent.atomic.AtomicReference;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import reactor.core.publisher.Flux;

public class Ex11CustomSubscriber2 {

	public static void main(String[] args) throws InterruptedException {

		//this is to hold the referrence of the subscription object
		AtomicReference<Subscription> atomicReferrence = new AtomicReference<>();

		Flux.range(1, 10)
		.log()
		.subscribeWith(new Subscriber<Integer>() {

			@Override
			public void onSubscribe(Subscription subscription) {
				System.out.println("received subscription: "+ subscription);
				atomicReferrence.set(subscription);
			}

			@Override
			public void onNext(Integer integer) {
				System.out.println("onNext "+ integer);

			}

			@Override
			public void onError(Throwable throwable) {
				System.out.println("onError "+throwable.getMessage());
			}

			@Override
			public void onComplete() {
				System.out.println("onComplete ");
			}


		});
		
		
		
		
		Thread.sleep(3000);
		atomicReferrence.get().request(3);
		Thread.sleep(3000);
		atomicReferrence.get().request(3);
		System.out.println("cancelling the subscription");
		atomicReferrence.get().cancel();
		atomicReferrence.get().request(4);
		
		
		
	}


}
