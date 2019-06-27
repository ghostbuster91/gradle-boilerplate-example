//package io.ghostbuster91.boilerplate.example
//
//import io.reactivex.functions.FunctionsOut;
//import io.reactivex.Observable
//import io.reactivex.annotations.CheckReturnValue
//import io.reactivex.annotations.SchedulerSupport
//import io.reactivex.rxkotlin.ObservablesExt
//
//fun main() {
//    val a = Observable.just("")
////    Observables.combineLatest<String,String,String,String,String,String,String,String,String,String>(a,a,a,a,a,a,a,a,a,{s1, s2, s3, s4, s5, s6, s7, s8, s9 -> "" })
////    ObservableExt.combineLatest<String,String,String,String,String,String,String,String,String,String,String>(a,a,a,a,a,a,a,a,a,a,{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10 -> "" })
//    ObservablesExt.combineLatest(a, a, a, a, a, a, a, a, a, a, Function10 { o, o2, o3, o4, o5, o6, o7, o8, o9, o10 -> ""})
//}
//@CheckReturnValue
//@SchedulerSupport(SchedulerSupport.NONE)
//inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> combineLatest(source1: Observable<T1>, source2: Observable<T2>,
//                                                                      source3: Observable<T3>, source4: Observable<T4>,
//                                                                      source5: Observable<T5>, source6: Observable<T6>,
//                                                                      source7: Observable<T7>, source8: Observable<T8>,
//                                                                      source9: Observable<T9>, source10: Observable<T10>,
//                                                                      crossinline combineFunction: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R) =
//    Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8, source9, source10,
//        Function10 { t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10-> combineFunction(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10) })
//
//
//@CheckReturnValue
//@SchedulerSupport(SchedulerSupport.NONE)
//inline fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,R> combineLatest(source1: Observable<T1>, source2: Observable<T2>,
//                                                        source3: Observable<T3>, source4: Observable<T4>,
//                                                        source5: Observable<T5>, source6: Observable<T6>,
//                                                        source7: Observable<T7>, source8: Observable<T8>,
//                                                        source9: Observable<T9>, crossinline combineFunction: (T1,T2, T3, T4, T5, T6, T7, T8, T9) -> R) =
//    Observable.combineLatest(source1, source2,source3, source4, source5, source6, source7, source8, source9,
//        Function9 { t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9 -> combineFunction(t1,t2, t3, t4, t5, t6, t7, t8, t9) })
