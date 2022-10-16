package com.pool.observable;

import io.reactivex.Observable;
import io.reactivex.Single;

public class ObservableClient {
	public static void main(String[] args) {
		Observable.just("Shiva").subscribe(System.out::println);
		Single<String> singleObject=Single.just("Shiva");
		
	}
}
