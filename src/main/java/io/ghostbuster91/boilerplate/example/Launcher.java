package io.ghostbuster91.boilerplate.example;

import io.reactivex.Observable;
import io.reactivex.ObservableExt;
import io.reactivex.functions.FunctionsOut;

public class Launcher {
    public static void main(String[] args) {
        Observable<String> a = Observable.just("");

        ObservableExt.combineLatest(a, a, a, a, a, a, a, a, a, a, (FunctionsOut.Function10) (o, o2, o3, o4, o5, o6, o7, o8, o9, o10) -> "");

    }
}
