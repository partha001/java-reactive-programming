package com.partha.WorkingWithFlux;

import java.util.concurrent.atomic.AtomicReference;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import reactor.core.publisher.Flux;

public class Ex11CustomSubscriber {

	public static void main(String[] args) {

		//this is to hold the referrence of the subscription object
		AtomicReference<Subscription> atomicReferrence = new AtomicReference<>();

		Flux.range(1, 5)
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

	}

}
