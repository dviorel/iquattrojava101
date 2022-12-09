package bo.gob.impuestos.java101.rxjava;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class DemoConectable {

    public static void main(String[] args) throws InterruptedException {
        String[] letras = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result = new StringBuilder();
        ConnectableObservable<String> connectable =
            Observable.fromArray(letras).publish();
        connectable.subscribe(letra -> result.append(letra));
        Thread.sleep(100);
        System.out.println(result.length());
        connectable.connect();
        System.out.println(result.length());
        System.out.println(result);

    }


}
