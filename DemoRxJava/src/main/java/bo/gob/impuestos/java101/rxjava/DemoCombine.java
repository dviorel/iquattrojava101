package bo.gob.impuestos.java101.rxjava;

import io.reactivex.Observable;

public class DemoCombine {

    static Observable<String> obtenerCadenas(){
        String[] arr = {"a.", "b", "c.", "d", "e", "f"};
        return Observable.fromArray(arr);
    }

    static Observable<Integer> obtenerNumeros(){
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        return Observable.fromArray(arr);
    }

    public static void main(String[] args) {
        Observable<String> observable1 = obtenerCadenas();
        Observable<Integer> observable2 = obtenerNumeros();
        Observable.combineLatest(observable1, observable2,
                                 (a, b) -> a + b)
            .subscribe(System.out::println);
    }

}
