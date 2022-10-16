package com.pool.reactive.flux;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import reactor.core.publisher.Flux;

public class FluxClient {
	public static void main(String[] args) {
		Flux<String> publisher = Flux.just("Superman", "Batman", "Death Stroke");
		Consumer<String> consumer = System.out::println;
		publisher.subscribe(consumer);
		
		List<String> names = Arrays.asList("Hulk", "Ironman", "Antman");
		Flux<String> collectionToFluxPublisher = Flux.fromIterable(names);
		collectionToFluxPublisher.subscribe(consumer);
		
		
	}
}
