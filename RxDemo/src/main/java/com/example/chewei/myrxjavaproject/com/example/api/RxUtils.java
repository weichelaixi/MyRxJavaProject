package com.example.chewei.myrxjavaproject.com.example.api;

import com.example.chewei.myrxjavaproject.com.example.api.base.BaseResponse;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
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

    public static <T> Observable.Transformer<BaseResponse<T>, T> handleResult() {   //compose判断结果,可以根据notifCode提前结束
        return new Observable.Transformer<BaseResponse<T>, T>() {
            @Override
            public Observable<T> call(Observable<BaseResponse<T>> baseResponseObservable) {
                return baseResponseObservable.flatMap(new Func1<BaseResponse<T>, Observable<T>>() {
                    @Override
                    public Observable<T> call(BaseResponse<T> tBaseResponse) {
                        return null;
                    }
                });
            }
        };
    }

}
