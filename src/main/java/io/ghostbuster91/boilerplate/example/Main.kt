package io.ghostbuster91.boilerplate.example

import io.reactivex.functions.FunctionsOut.*;
import io.reactivex.Observable
import io.reactivex.ObservableExt
import io.reactivex.annotations.CheckReturnValue
import io.reactivex.annotations.SchedulerSupport
import io.reactivex.rxkotlin.ObservablesExt

fun main() {
    val a = Observable.just("")
    ObservablesExt.combineLatest(a, a, a, a, a, a, a, a, a, a, { o, o2, o3, o4, o5, o6, o7, o8, o9, o10 -> ""})
}
