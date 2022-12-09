package bo.gob.impuestos.java101.rxjava;

import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class DemoSubjects {

    public static void main(String[] args) {
        final StringBuilder result1 = new StringBuilder();
        final StringBuilder result2 = new StringBuilder();
        Subject<String> subject = PublishSubject.create();
        subject.subscribe(value -> result1.append(value) );
        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");
        subject.subscribe(value -> result2.append(value));
        subject.onNext("d");
        subject.onComplete();
        System.out.println(result1);
        System.out.println(result2);

    }

}
