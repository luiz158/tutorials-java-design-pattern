package others.rxjava;

import rx.Observable;

public class RxJavaSample3 {

    public static void main(String[] args) {

        Observable.just("Hello World").subscribe(s -> System.out.println(s + "- Dan"));

    }

}
