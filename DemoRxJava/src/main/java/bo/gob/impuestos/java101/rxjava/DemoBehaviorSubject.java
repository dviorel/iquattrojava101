package bo.gob.impuestos.java101.rxjava;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class DemoBehaviorSubject {

    public static void main(String[] args) {
        final StringBuilder result1 = new StringBuilder();
        final StringBuilder result2 = new StringBuilder();
        Subject<String> subject = BehaviorSubject.create();
        subject.subscribe(value -> result1.append(value) );
        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");
        subject.subscribe(value -> result2.append(value));
        subject.onNext("d");
        subject.onNext("e");
        subject.onNext("f");
        subject.onComplete();
        System.out.println(result1);
        System.out.println(result2);

    }

}
