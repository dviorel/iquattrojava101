package bo.gob.impuestos.java101.rxjava;

import io.reactivex.Observable;

public class DemoIfEmpty {

    static Observable<String> obtenerDatoRemoto(){
//        String[] arr = {"a", "b", "c", "d"};
//        return Observable.fromArray(arr);
        return Observable.empty();
    }

    public static void main(String[] args) {
        Observable<String> observable = obtenerDatoRemoto();
        observable
            .defaultIfEmpty("No hubo datos")
            .subscribe(System.out::println);
    }

}
