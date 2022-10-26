package com.pool.reactive.take;

import java.util.function.Predicate;

import reactor.core.publisher.Flux;

public class TakeClient {
    public static void main(String[] args) {
        var countLimit = 10;
        Flux<Integer> dataStream = range().take(countLimit);
        dataStream.subscribe(System.out::println);
        countLimit = 50;
        var newLimit = 70;
        Predicate<Integer> predicate = num -> num == (newLimit - num);
        Flux<Integer> takeUtilDataStream = range().takeUntil(predicate);
        takeUtilDataStream.subscribe(System.out::println);
    }

    private static Flux<Integer> range() {
        return Flux.range(0, 500);
    }
}
