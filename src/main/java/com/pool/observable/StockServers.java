package com.pool.observable;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;

public class StockServers {

	public static Observable<StockInfo> getFeed(List<String> mncs) {
		return Observable.create(subscriber -> processrequest(subscriber, mncs));
	}

	private static void processrequest(ObservableEmitter<StockInfo> subscriber, List<String> mncs) {
		System.out.println("Prosessing");
		mncs.stream().map(StockFetcher::fetch).forEach(subscriber::onNext);
	}

}
