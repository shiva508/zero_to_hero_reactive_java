package com.pool;

import java.util.List;

import com.pool.observable.StockInfo;
import com.pool.observable.StockServers;

import io.reactivex.Observable;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var mncs = List.of("GOOGLE", "APPLE", "FACEBOOK");
        Observable<StockInfo> feed = StockServers.getFeed(mncs);
        feed.subscribe(System.out::println);
        System.out.println("gotData:");

    }
}
