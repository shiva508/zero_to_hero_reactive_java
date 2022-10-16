package com.pool.reactive.mono;

import reactor.core.publisher.Mono;

public class MonoClient {
	public static void main(String[] args) {
		Mono<String> emptyPublisher = Mono.empty();
		Mono<String> publisher = Mono.just("Batman");
		Mono<String> valueOrEmptyValPublisher = Mono.justOrEmpty("Batman");
	}
}
