package com.example.chewei.myrxjavaproject.com.example.api;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ${chewei} on 2017/12/12.
 * params:2017/12/12
 */

public class RxUtils {
    /**
     * 统一线程处理
     */

    public static <T> Observable.Transformer<T,T> rxSchedulerHelper() {    //compose简化线程
        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> tObservable) {
                return tObservable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

}
